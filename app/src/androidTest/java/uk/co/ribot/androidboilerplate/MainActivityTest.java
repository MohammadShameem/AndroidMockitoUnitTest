package uk.co.ribot.androidboilerplate;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;

import uk.co.ribot.androidboilerplate.ui.main.MainMvpView;
import uk.co.ribot.androidboilerplate.ui.main.MainPresenter;

import static junit.framework.Assert.assertTrue;


@RunWith(MockitoJUnitRunner.class)
public class MainActivityTest {

    @InjectMocks
    MainPresenter mainPresenter;

    @Mock
    MainMvpView mainMvpView;

    @Captor
    ArgumentCaptor argumentCaptor;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);

    }

    @Test
    public void callbackTest(){

        //activity call of a presenter function with argument
        mainPresenter.something("book");
        Mockito.verify(mainMvpView).somethingMore((String) argumentCaptor.capture());
        assertTrue(argumentCaptor.getValue().equals("ok"));


    }


    @Test
    public void callbackTesttwo(){

        mainPresenter.something("book");
        mainPresenter.something("pook");
        Mockito.verify(mainMvpView,Mockito.times(2)).somethingMore("ok");

    }



}
