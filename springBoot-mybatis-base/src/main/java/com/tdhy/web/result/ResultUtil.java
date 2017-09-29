package com.tdhy.web.result;

/**
 * 包装结果集
 * @author YuXiaolong 2017-08-24
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class ResultUtil {
  public static Result success() {
		return new Result(ResultEnum.SUCCESS.getCode(), ResultEnum.SUCCESS.getName());
	}

  public static Result success(ResultEnum renum,Object obj) {
			return new Result(obj,renum.getCode(), renum.getName());
	 }
	
  public static Result error(ResultEnum renum) {
		return new Result(renum.getCode(), renum.getName());
	}
}
