package com.projects.MiniBank.service.serviceImpl;

import com.projects.MiniBank.dto.SignUpDto;
import com.projects.MiniBank.entity.AppUser;
import com.projects.MiniBank.repositories.UserRepository;
import com.projects.MiniBank.service.AppUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AppUserServiceImpl implements AppUserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void register(SignUpDto signUpDto) {
        AppUser appUser = new AppUser();
        appUser.setEmail(signUpDto.getEmail());
        appUser.setPassword(passwordEncoder.encode(signUpDto.getPassword()));
        appUser.setRole(signUpDto.getRole());

        userRepository.save(appUser);
    }
}
