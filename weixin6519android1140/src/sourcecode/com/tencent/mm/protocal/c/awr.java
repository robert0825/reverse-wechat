package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class awr
  extends ayx
{
  public String tVO;
  public String tVU;
  public int time_stamp;
  
  public awr()
  {
    GMTrace.i(3925600108544L, 29248);
    GMTrace.o(3925600108544L, 29248);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3925734326272L, 29249);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVU == null) {
        throw new b("Not all required fields were included: brand_user_name");
      }
      if (this.tVO == null) {
        throw new b("Not all required fields were included: bizchat_id");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tVU != null) {
        paramVarArgs.e(2, this.tVU);
      }
      if (this.tVO != null) {
        paramVarArgs.e(3, this.tVO);
      }
      paramVarArgs.fk(4, this.time_stamp);
      GMTrace.o(3925734326272L, 29249);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.tVU != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tVU);
      }
      i = paramInt;
      if (this.tVO != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tVO);
      }
      paramInt = b.a.a.a.fh(4, this.time_stamp);
      GMTrace.o(3925734326272L, 29249);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tVU == null) {
        throw new b("Not all required fields were included: brand_user_name");
      }
      if (this.tVO == null) {
        throw new b("Not all required fields were included: bizchat_id");
      }
      GMTrace.o(3925734326272L, 29249);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      awr localawr = (awr)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3925734326272L, 29249);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localawr.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3925734326272L, 29249);
        return 0;
      case 2: 
        localawr.tVU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3925734326272L, 29249);
        return 0;
      case 3: 
        localawr.tVO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3925734326272L, 29249);
        return 0;
      }
      localawr.time_stamp = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3925734326272L, 29249);
      return 0;
    }
    GMTrace.o(3925734326272L, 29249);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\awr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */