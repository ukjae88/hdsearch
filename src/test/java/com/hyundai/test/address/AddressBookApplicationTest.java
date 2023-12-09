package com.hyundai.test.address;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 모든 데이터는 success.csv 파일에서 읽어서 메모리에 등록한 후, 사용하시면 됩니다.(DB 사용 불필요)
 */
class AddressBookApplicationTest {

    /**
     * 고객명으로 검색 후, 검색된 주소록 갯수가 맞는지 확인하는 테스트를 작성해주세요.
     */
    @Test
    public void searchAddressByName() {
        String name = "이몽룡";
        int size = -1;
        Assertions.assertThat(size).isEqualTo(2);
    }

    /**
     * 전화번호로 검색 후 해당 고객이 맞는지 고객명을 확인하는 테스트를 작성해주세요.
     */
    @Test
    public void searchByPhone() {
        String phone = "01000000000";
        String searched = "";
        Assertions.assertThat(searched).isEqualTo("홍길동");
    }

    /**
     * 주어진 고객명과 동일한 이름을 가진 고객들을 찾아 제거한 후,
     * 전체 주소록 갯수가 정상적으로 줄어들었는지 확인하는 코드를 작성해 주세요.
     */
    @Test
    public void removeAddressByName() {
        String name = "이몽룡";
        int size = -1;
        Assertions.assertThat(size).isEqualTo(3);
    }

    /**
     * 고객의 전화번호를 입력 받아 해당 고객을 주소록에서 제거 후 정상적으로 주소록 전체 수가 줄었는지 확인하는 테스트를 작성하세요.
     */
    @Test
    public void removeAddressByPhone() {
        String phone = "01000000000";
        int size = -1;
        Assertions.assertThat(size).isEqualTo(4);
    }
}