package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bkj
  extends ayx
{
  public String tVO;
  public String tVU;
  public hb uVf;
  public hb uVg;
  
  public bkj()
  {
    GMTrace.i(3913252077568L, 29156);
    GMTrace.o(3913252077568L, 29156);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3913386295296L, 29157);
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
      if (this.uVf != null)
      {
        paramVarArgs.fm(4, this.uVf.aYq());
        this.uVf.a(paramVarArgs);
      }
      if (this.uVg != null)
      {
        paramVarArgs.fm(5, this.uVg.aYq());
        this.uVg.a(paramVarArgs);
      }
      GMTrace.o(3913386295296L, 29157);
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
      paramInt = i;
      if (this.uVf != null) {
        paramInt = i + b.a.a.a.fj(4, this.uVf.aYq());
      }
      i = paramInt;
      if (this.uVg != null) {
        i = paramInt + b.a.a.a.fj(5, this.uVg.aYq());
      }
      GMTrace.o(3913386295296L, 29157);
      return i;
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
      GMTrace.o(3913386295296L, 29157);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bkj localbkj = (bkj)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3913386295296L, 29157);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbkj.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3913386295296L, 29157);
        return 0;
      case 2: 
        localbkj.tVU = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3913386295296L, 29157);
        return 0;
      case 3: 
        localbkj.tVO = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3913386295296L, 29157);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new hb();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((hb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbkj.uVf = ((hb)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3913386295296L, 29157);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new hb();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((hb)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localbkj.uVg = ((hb)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3913386295296L, 29157);
      return 0;
    }
    GMTrace.o(3913386295296L, 29157);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bkj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */