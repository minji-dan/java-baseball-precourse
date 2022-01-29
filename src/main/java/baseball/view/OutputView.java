package baseball.view;

public class OutputView {
    private static final String BALL = "볼 ";
    private static final String STRIKE = "스트라이크 ";
    private static final String NOTHING = "낫싱";
    private static final String ALL_CORRECT = "모두 맞히셨습니다. 게임종료";

    private OutputView(){}

    public static void printScore(Score score){

        int ballCnt=score.getBallCnt();
        int strikeCnt=score.getStrikeCnt();

        printBallPoint(ballCnt);
        printStrikePoint(strikePoint);
        printIsNothing(ballCnt, strikeCnt);

        System.out.println("\n");
    }

    private static void printBallPoint(int ballcnt){
        if (ballCnt != 0){
            printMsg(ballCnt);
            printMsg(BALL);
        }
    }

    private static void printStrikePoint(int strikeCnt){

        if(strikeCnt != 0){
            printMsg(strikeCnt);
            printMsg(STRIKE);
        }
    }

    private static void printIsNothing(int ballCnt, int strikeCnt){

        if(ballCnt==0 && strikeCnt==0){
            printMsg(NOTHING);
        }
    }

    public static void printGameOver(){
        printMsg(ALL_CORRENCT);
    }
    public static void printMsg(object msg){
        System.out.println(msg);
    }
}
