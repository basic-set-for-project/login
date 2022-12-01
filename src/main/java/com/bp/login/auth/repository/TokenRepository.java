package com.bp.login.auth.repository;

import com.bp.login.auth.domain.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TokenRepository extends JpaRepository<RefreshToken, String> {
    Optional<RefreshToken> findByUuid(String Uuid);
}
