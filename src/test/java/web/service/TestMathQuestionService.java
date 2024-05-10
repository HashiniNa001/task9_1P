package web.service;

import static org.junit.Assert.assertThrows;

import org.junit.Assert;
import org.junit.Test;

import web.service.MathQuestionService;

public class TestMathQuestionService {

	@Test
	public void testTrueAdd() {
		Assert.assertEquals(MathQuestionService.q1Addition("1", "2"), 3, 0);
	}

	@Test
    public void testAddNumber1Empty() {
        double result = MathQuestionService.q1Addition("", "2");
        Assert.assertEquals(result, 0, 0);
    }	
	
	@Test
    public void testQ1Addition_ValidInput() {
        double result = MathQuestionService.q1Addition("5", "10");
        Assert.assertEquals(result, 15, 0);
    }

    @Test
    public void testQ1Addition_InvalidInput_Null() {
        assertThrows(NumberFormatException.class, () -> {
            MathQuestionService.q1Addition(null, "10");
        });
    }

    @Test
    public void testQ1Addition_InvalidInput_NonNumeric() {
        assertThrows(NumberFormatException.class, () -> {
            MathQuestionService.q1Addition("abc", "10");
        });
    }

    @Test
    public void testQ2Subtraction_ValidInput() {
        double result = MathQuestionService.q2Subtraction("10", "5");
        Assert.assertEquals(result, 5, 0);
    }

    @Test
    public void testQ2Subtraction_InvalidInput_Null() {
        assertThrows(NumberFormatException.class, () -> {
            MathQuestionService.q2Subtraction(null, "5");
        });
    }

    @Test
    public void testQ2Subtraction_InvalidInput_NonNumeric() {
        assertThrows(NumberFormatException.class, () -> {
            MathQuestionService.q2Subtraction("abc", "5");
        });
    }
}
