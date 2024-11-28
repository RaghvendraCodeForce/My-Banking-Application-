package Raghav.BankingApplicaton.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Raghav.BankingApplicaton.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

	
	
}
