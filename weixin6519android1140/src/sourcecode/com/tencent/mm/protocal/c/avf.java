package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class avf
  extends ayx
{
  public int jhA;
  public String lSY;
  public long uKe;
  public long uKh;
  public int uhU;
  public long uhV;
  
  public avf()
  {
    GMTrace.i(4048006676480L, 30160);
    GMTrace.o(4048006676480L, 30160);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4048140894208L, 30161);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.lSY == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.lSY != null) {
        paramVarArgs.e(2, this.lSY);
      }
      paramVarArgs.fk(3, this.uhU);
      paramVarArgs.T(4, this.uhV);
      paramVarArgs.T(5, this.uKe);
      paramVarArgs.T(6, this.uKh);
      paramVarArgs.fk(7, this.jhA);
      GMTrace.o(4048140894208L, 30161);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.uNh != null) {
        paramInt = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      i = paramInt;
      if (this.lSY != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lSY);
      }
      paramInt = b.a.a.a.fh(3, this.uhU);
      int j = b.a.a.a.S(4, this.uhV);
      int k = b.a.a.a.S(5, this.uKe);
      int m = b.a.a.a.S(6, this.uKh);
      int n = b.a.a.a.fh(7, this.jhA);
      GMTrace.o(4048140894208L, 30161);
      return i + paramInt + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.lSY == null) {
        throw new b("Not all required fields were included: FromUserName");
      }
      GMTrace.o(4048140894208L, 30161);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      avf localavf = (avf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(4048140894208L, 30161);
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
          localavf.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(4048140894208L, 30161);
        return 0;
      case 2: 
        localavf.lSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(4048140894208L, 30161);
        return 0;
      case 3: 
        localavf.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(4048140894208L, 30161);
        return 0;
      case 4: 
        localavf.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(4048140894208L, 30161);
        return 0;
      case 5: 
        localavf.uKe = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(4048140894208L, 30161);
        return 0;
      case 6: 
        localavf.uKh = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(4048140894208L, 30161);
        return 0;
      }
      localavf.jhA = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(4048140894208L, 30161);
      return 0;
    }
    GMTrace.o(4048140894208L, 30161);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\avf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */