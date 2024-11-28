package Raghav.BankingApplicaton.service.impl;

import Raghav.BankingApplication.AccountDto.AccountDto;
import Raghav.BankingApplicaton.repository.AccountRepository;
import Raghav.BankingApplicaton.service.AccountService;

public class AccountServiceImpl implements AccountService {
	
	
	private AccountRepository accountRepository;
	
	
	// count have used Autowired annotation but in new updates spring bean does that on it's own
	public AccountServiceImpl(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	

	@Override
	public AccountDto createAccount(AccountDto accountDto) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
