package com.example.defectmanager.presentation;

import com.example.defectmanager.application.MemberRegisterService;
import com.example.defectmanager.application.dto.MemberRegisterRequestDto;
import com.example.defectmanager.domain.errors.MemberAlreadyExistException;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class MemberController {

    private final MemberRegisterService memberRegisterService;

    @PostMapping("/register")
    public String registerMember(final @Valid MemberRegisterRequestDto registerDto, final BindingResult bindingResult, final Model model) {
        if (bindingResult.hasErrors()) {

        }

        try {
            memberRegisterService.registerMember(registerDto);
        } catch (MemberAlreadyExistException e) {
            bindingResult.rejectValue("email", "registerDto.email", "An account already exists for this email.");
        }

        return "/starter";
    }
}
