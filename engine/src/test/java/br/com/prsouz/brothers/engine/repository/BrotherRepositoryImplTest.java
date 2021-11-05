package br.com.prsouz.brothers.engine.repository;

import br.com.prsouz.brothers.engine.core.model.BrotherModel;
import br.com.prsouz.brothers.engine.entity.BrothersEntity;
import br.com.prsouz.brothers.engine.utility.BrotherConverter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.*;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;


class BrotherRepositoryImplTest {

    @BeforeEach
    public void initMocks() {

        MockitoAnnotations.initMocks(this);
    }

    @Mock
    BrotherConverter brotherConverter;

    @Mock
    BrotherCrud brotherCrud;

    @InjectMocks
    BrotherRepositoryImpl brotherRepositoryImpl;

    @Test
    void createNewBrother() {
        //Given
        LocalDateTime timeNow = LocalDateTime.now();
        BrotherModel brotherModel = new BrotherModel(23L,"Paulo",532, timeNow,"29902349854");
        BrothersEntity brothersEntity = new BrothersEntity(23L,"Paulo",532, timeNow,"29902349854");
        Mockito.when(brotherConverter.convertBrotherModelToEntity(Mockito.any(BrotherModel.class))).thenReturn(brothersEntity);
        Mockito.when(brotherCrud.save(Mockito.any(BrothersEntity.class))).thenReturn(brothersEntity);
        Mockito.when(brotherConverter.convertBrotherEntityToModel(Mockito.any(BrothersEntity.class))).thenReturn(brotherModel);
        ArgumentCaptor<BrothersEntity> captor = ArgumentCaptor.forClass(BrothersEntity.class);

        //When
        BrotherModel received = brotherRepositoryImpl.CreateNewBrother(brotherModel);

        //Then
        verify(brotherCrud).save(captor.capture());
        Integer cim = captor.getValue().getCim();
        assertEquals(288, cim);
        assertEquals(532,received.getCim());

    }

    @Test
    void getAllBrothers() {
    }
}