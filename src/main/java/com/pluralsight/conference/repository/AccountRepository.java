package com.pluralsight.conference.repository;

import com.pluralsight.conference.entities.AppUser;
import com.pluralsight.conference.model.Account;
import com.pluralsight.conference.model.VerificationToken;

public interface AccountRepository {
    public Account create (Account account);

    void saveToken(VerificationToken verificationToken);

    VerificationToken findByToken(String token);

    Account findByUsername(String username);

    void createUserDetails(AppUser userDetails);

    void createAuthorities(AppUser userDetails);

    void delete(Account account);

    void deleteToken(String token);
}
