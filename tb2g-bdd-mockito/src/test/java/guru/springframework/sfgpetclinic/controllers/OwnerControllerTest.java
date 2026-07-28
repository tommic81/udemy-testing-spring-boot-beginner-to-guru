package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.fauxspring.BindingResult;
import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.services.OwnerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    private static final String OWNERS_CREATE_OR_UPDATE_OWNER_FORM = "owners/createOrUpdateOwnerForm";
    private static final String REDIRECT_OWNERS_5 = "redirect:/owners/5";

    @Mock
    private OwnerService ownerService;

    @Mock
    private BindingResult bindingResult;

    @InjectMocks
    private OwnerController ownerController;

    @Test
    void processCreationFormHasErrors() {
        //given
        given(bindingResult.hasErrors()).willReturn(Boolean.TRUE);
        Owner owner = new Owner(1l, "John", "Kowalsky");

        //when
        String resultView = ownerController.processCreationForm(owner, bindingResult);

        //then
        assertThat(resultView).isNotNull().isEqualToIgnoringCase(OWNERS_CREATE_OR_UPDATE_OWNER_FORM);
    }

    @Test
    void processCreationFormNoErrors() {
        //given
        given(bindingResult.hasErrors()).willReturn(Boolean.FALSE);
        Owner owner = new Owner(5l, "John", "Kowalsky");

        given(ownerService.save(any(Owner.class))).willReturn(owner);

        //when
        String resultView = ownerController.processCreationForm(owner, bindingResult);

        //then
        assertThat(resultView).isNotNull().isEqualToIgnoringCase(REDIRECT_OWNERS_5);
    }
}