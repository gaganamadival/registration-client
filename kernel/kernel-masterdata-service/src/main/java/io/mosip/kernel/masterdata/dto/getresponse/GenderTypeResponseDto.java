package io.mosip.kernel.masterdata.dto.getresponse;

import java.util.List;

import io.mosip.kernel.masterdata.dto.GenderTypeDto;
import lombok.Data;

/**
 * Response DTO for fetching gender Data
 * 
 * @author Sidhant Agarwal
 * @since 1.0.0
 *
 */
@Data


public class GenderTypeResponseDto {
	private List<GenderTypeDto> genderType;

}
