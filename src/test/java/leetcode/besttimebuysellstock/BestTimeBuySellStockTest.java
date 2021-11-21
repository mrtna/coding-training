package leetcode.besttimebuysellstock;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class BestTimeBuySellStockTest {

	@Test
	void maxProfit_should_when_1_5_should_be_4() {
		int[] ints = {1, 5};
		int expected = 4;

		int maxProfit = new BestTimeBuySellStock().maxProfit(ints);

		Assertions.assertEquals(expected, maxProfit);
	}

	@Test
	void maxProfit_should_when_5_1_should_be_0() {
		int[] ints = {5, 1};
		int expected = 0;

		int maxProfit = new BestTimeBuySellStock().maxProfit(ints);

		Assertions.assertEquals(expected, maxProfit);
	}

	@Test
	void maxProfit_should_when_5_10_11_1_should_be_6() {
		int[] ints = {5,10,11,1};
		int expected = 6;

		int maxProfit = new BestTimeBuySellStock().maxProfit(ints);

		Assertions.assertEquals(expected, maxProfit);
	}
}
