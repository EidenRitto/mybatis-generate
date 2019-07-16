package diy;

/**
 * @author 周晋平
 * @date 2019/7/10 18:24
 */
public enum GenEnum {
    /**通过主键删除*/
    DELETE("deleteByPrimaryKey","通过主键删除",
            "主键id","删除成功数量"),
    /**新增数据插入全部列*/
    INSERT("insert","新增数据插入全部列",
            "新增记录参数","新增成功数量"),
    /**新增数据插入有数据的列*/
    INSERTSELECTIVE("insertSelective","新增数据插入有数据的列",
            "新增记录参数","新增成功数量"),
    /**通过主键修改全部列*/
    UPDATE("updateByPrimaryKey","通过主键修改全部列",
            "修改记录参数","修改成功数量"),
    /**通过主键修改有数据的列*/
    UPDATESELECTIVE("updateByPrimaryKeySelective","通过主键修改有数据的列",
            "修改记录参数","修改成功数量"),
    /**通过主键查询*/
    SELECT("selectByPrimaryKey","通过主键查询",
            "主键id","主键符合的唯一Po记录");

    GenEnum(String name, String methodComment, String parameterComment, String returnComment) {
        this.name = name;
        this.methodComment = methodComment;
        this.parameterComment = parameterComment;
        this.returnComment = returnComment;
    }

    /**操作名称*/
    private String name;
    /**操作注释*/
    private String methodComment;
    /**参数注释*/
    private String parameterComment;
    /**返回变量注释*/
    private String returnComment;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMethodComment() {
        return methodComment;
    }

    public void setMethodComment(String methodComment) {
        this.methodComment = methodComment;
    }

    public String getParameterComment() {
        return parameterComment;
    }

    public void setParameterComment(String parameterComment) {
        this.parameterComment = parameterComment;
    }

    public String getReturnComment() {
        return returnComment;
    }

    public void setReturnComment(String returnComment) {
        this.returnComment = returnComment;
    }}
