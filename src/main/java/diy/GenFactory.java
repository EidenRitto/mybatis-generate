package diy;

/**
 * @author 周晋平
 * @date 2019/7/11 8:53
 */
public class GenFactory {
    public static GenEnum getMethodComment(String methodName){
        switch (methodName){
            case "deleteByPrimaryKey":
                return GenEnum.DELETE;
            case "insert":
                return GenEnum.INSERT;
            case "insertSelective":
                return GenEnum.INSERTSELECTIVE;
            case "selectByPrimaryKey":
                return GenEnum.SELECT;
            case "updateByPrimaryKeySelective":
                return GenEnum.UPDATESELECTIVE;
            case "updateByPrimaryKey":
                return GenEnum.UPDATE;
            default:
                return null;
        }
    }
}
