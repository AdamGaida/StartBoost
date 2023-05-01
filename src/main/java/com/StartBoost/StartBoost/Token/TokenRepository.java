package com.StartBoost.StartBoost.Token;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly = true)
public interface TokenRepository extends JpaRepository<Token, Integer> {
    Optional<Token> findTokenByUserId(Integer id);

    @Query(value = """
    select t from Token t inner join User u\s
    on t.user.id = u.id\s
    where u.id = :id and (t.expired = false or t.revoked = false)\s

""")
    List<Token> findAllValidTokenByUser(Integer id);

    Optional<Token> findByToken(String token);
}