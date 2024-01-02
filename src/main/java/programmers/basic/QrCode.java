package programmers.basic;
/**
 * 날짜: 2024/01/02
 * 내용: 코딩 기초 트레이닝_qr code
 */
class QrCode {
    public String qrCode(int q, int r, String code) {
        StringBuilder sb = new StringBuilder();

        for(int i =0; i<code.length(); i++){
            if(i%q == r){
                sb.append(code.charAt(i));
            }
        }
        return sb.toString();
    }
}
