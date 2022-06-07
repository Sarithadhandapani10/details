package com.cts.pensioner.detail;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

import com.cts.pensioner.detail.model.PensionerDetail;

import nl.jqno.equalsverifier.EqualsVerifier;
import nl.jqno.equalsverifier.Warning;

@SpringBootTest
class PensionerDetailMicroserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void main()
	{
		PensionerDetailMicroserviceApplication.main(new String[] {});
	}
	
	@Test
	void testNoArgs()
	{
		assertThat(new PensionerDetail()).isNotNull();
	}
	
	
	@Test
	void testAllArgs()
	{
		PensionerDetail pensionerDetail = new PensionerDetail(529585952101l, "Saritha", LocalDate.of(1999, 11, 04), "SBIN0084235", 27000, 1500, "self", "SBI", "9873450876", "private");
		assertThat(assertThat(pensionerDetail).isNotNull());
	}
	
	@Test
	void testSetterMethod()
	{
		PensionerDetail pensionerDetail = new PensionerDetail();
		pensionerDetail.setAadharNumber(529585952101l);
		pensionerDetail.setName("Saritha");
		pensionerDetail.setDateOfBirth(LocalDate.of(1999, 11, 04));
		pensionerDetail.setPan("SBIN0084235");
		pensionerDetail.setSalaryEarned(27000);
		pensionerDetail.setAllowances(1500);
		pensionerDetail.setPensionType("self");
		pensionerDetail.setBankName("SBI");
		pensionerDetail.setAccountNumber("9873450876");
		pensionerDetail.setBankType("private");
		
		assertThat(assertThat(pensionerDetail).isNotNull());
	}
	
	@Test
	void testEqualAndHashCode()
	{
		PensionerDetail pensionerDetail1 = new PensionerDetail(529585952101l, "Saritha", LocalDate.of(1999, 11, 04), "SBIN0084235", 27000, 1500, "self", "SBI", "9873450876", "private");
		PensionerDetail pensionerDetail2 = new PensionerDetail(529585952101l, "Saritha", LocalDate.of(1999, 11, 04), "SBIN0084235", 27000, 1500, "self", "SBI", "9873450876", "private");
		
			assertThat(assertThat(pensionerDetail1).isEqualTo(pensionerDetail2));
	
	}
	@Test
	void testNotEqualAndHashCode()
	{
		PensionerDetail pensionerDetail1 = new PensionerDetail(892559429862l, "Haritha", LocalDate.of(1999, 12, 03), "LSDUS1471H", 23000, 1300, "self", "SBI", "9134586523", "private");
		PensionerDetail pensionerDetail2 = new PensionerDetail(529585952101l, "Saritha", LocalDate.of(1999, 11, 04), "SBIN0084235", 27000, 1500, "self", "SBI", "9873450876", "private");
		
			assertThat(assertThat(pensionerDetail1).isNotEqualTo(pensionerDetail2));
	
	}	
	
}
