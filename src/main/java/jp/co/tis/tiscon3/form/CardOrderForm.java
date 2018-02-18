package jp.co.tis.tiscon3.form;

import lombok.Data;

import javax.validation.constraints.*;

@Data
public class CardOrderForm extends FormBase {

    private static final long serialVersionUID = 1L;

    @NotBlank(message="姓（漢字）を正しく変更してください")
    @Size(max = 30)
    private String kanjiName;

    @NotBlank(message="名（漢字）を正しく変更してください")
    @Size(max = 30)
    private String kanjiName2;

    @NotBlank(message="姓（カナ）を正しく変更してください")
    @Size(max = 90)
    @Pattern(regexp = "^[ァ-ヶー 　]*$")
    private String kanaName;

    @NotBlank(message="名（カナ）を正しく変更してください")
    @Size(max = 90)
    @Pattern(regexp = "^[ァ-ヶー 　]*$")
    private String kanaName2;

    @NotBlank(message="姓（ローマ字）を正しく変更してください")
    @Size(max = 120)
    @Pattern(regexp = "^[a-zA-Z 　]*$")
    private String alphabetName;

    @NotBlank(message="名（ローマ字）を正しく変更してください")
    @Size(max = 120)
    @Pattern(regexp = "^[a-zA-Z 　]*$")
    private String alphabetName2;

    @NotBlank(message="生年月日を選んでください")
    @Size(max = 10)
    private String dateOfBirth;

    @NotBlank(message="性別を選んでください")
    @Size(max = 6)
    private String gender;

    @NotBlank(message="郵便番号を正しく変更してください")
    @Size(max = 8)
    @Pattern(regexp = "(^[0-9]{7}$|^$)")
    private String zipCode;

    @NotBlank(message="番地・建物名を正しく変更してください")
    @Size(max = 255)
    private String address;

    @NotBlank(message="電話番号を正しく変更してください")
    @Size(max = 13)
    @Pattern(regexp = "^0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4}$")
    private String homePhoneNumber;

    @Size(max = 13)
    @Pattern(regexp = "^((070|080|090)-[0-9]{4}-[0-9]{4})?$")
    private String mobilePhoneNumber;

    @NotBlank(message="メールアドレスを入力してください")
    @Size(max = 255)
    @Email
    private String emailAddress;

    @NotBlank(message="配偶者有無を選択してください")
    @Size(max = 20)
    private String spouse;

    @NotBlank(message="お住まいを選択してください")
    @Size(max = 20)
    private String houseClassification;

    @NotBlank(message="ローン等のお借り入れ金額を正しく変更してください")
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String debt;

    @NotBlank(message="ご職業を選択してください")
    @Size(max = 120)
    private String job;

    @NotBlank(message="昨年の収入を正しく変更してください")
    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String income;

    @Size(max = 255)
    private String employerName;

    @Size(max = 8)
    @Pattern(regexp = "^([0-9]{3}-[0-9]{4})?$")
    private String employerZipCode;

    @Size(max = 255)
    private String employerAddress;

    @Size(max = 13)
    @Pattern(regexp = "^(0[0-9]{1,3}-[0-9]{2,4}-[0-9]{4})?$")
    private String employerPhoneNumber;

    @Size(max = 255)
    private String industryType;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String capital;

    @Size(max = 255)
    @Pattern(regexp = "[0-9]*")
    private String companySize;

    @Size(max = 255)
    private String position;

    @Size(max = 255)
    private String department;

    @Size(max = 6)
    @Pattern(regexp = "[0-9]*")
    private String employeeLength;

}
