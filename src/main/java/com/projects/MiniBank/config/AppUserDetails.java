package com.projects.MiniBank.config;
//
//import com.projects.MiniBank.entity.AppUser;
//import com.projects.MiniBank.repositories.UserRepository;
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@RequiredArgsConstructor
//@Service
public class AppUserDetails
// implements UserDetailsService
 {
//    private final UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        String userName, password = null;
//        List<GrantedAuthority> authorities = null;
//        List<AppUser> appUsers = userRepository.findByEmail(username);
//        if(appUsers.size() == 0){
//            throw new UsernameNotFoundException("Userdetails for the user: " + username +" not found");
//        }else{
//            userName = appUsers.get(0).getEmail();
//            password = appUsers.get(0).getPassword();
//            authorities = new ArrayList<>();
//            authorities.add(new SimpleGrantedAuthority(appUsers.get(0).getRole()));
//        }
//
//        return new User(userName, password, authorities);
//    }
}
