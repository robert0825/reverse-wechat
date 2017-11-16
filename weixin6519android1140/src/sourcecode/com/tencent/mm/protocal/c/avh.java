package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class avh
  extends ayx
{
  public String uKB;
  public int uKC;
  public int uKD;
  public long uKe;
  public long uKh;
  public int uhU;
  public long uhV;
  
  public avh()
  {
    GMTrace.i(3745614135296L, 27907);
    GMTrace.o(3745614135296L, 27907);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3745748353024L, 27908);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uKB == null) {
        throw new b("Not all required fields were included: FromUsername");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uKB != null) {
        paramVarArgs.e(2, this.uKB);
      }
      paramVarArgs.fk(3, this.uhU);
      paramVarArgs.T(4, this.uhV);
      paramVarArgs.T(5, this.uKe);
      paramVarArgs.fk(6, this.uKC);
      paramVarArgs.T(7, this.uKh);
      paramVarArgs.fk(8, this.uKD);
      GMTrace.o(3745748353024L, 27908);
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
      if (this.uKB != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uKB);
      }
      paramInt = b.a.a.a.fh(3, this.uhU);
      int j = b.a.a.a.S(4, this.uhV);
      int k = b.a.a.a.S(5, this.uKe);
      int m = b.a.a.a.fh(6, this.uKC);
      int n = b.a.a.a.S(7, this.uKh);
      int i1 = b.a.a.a.fh(8, this.uKD);
      GMTrace.o(3745748353024L, 27908);
      return i + paramInt + j + k + m + n + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uKB == null) {
        throw new b("Not all required fields were included: FromUsername");
      }
      GMTrace.o(3745748353024L, 27908);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      avh localavh = (avh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3745748353024L, 27908);
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
          localavh.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3745748353024L, 27908);
        return 0;
      case 2: 
        localavh.uKB = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3745748353024L, 27908);
        return 0;
      case 3: 
        localavh.uhU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3745748353024L, 27908);
        return 0;
      case 4: 
        localavh.uhV = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3745748353024L, 27908);
        return 0;
      case 5: 
        localavh.uKe = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3745748353024L, 27908);
        return 0;
      case 6: 
        localavh.uKC = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3745748353024L, 27908);
        return 0;
      case 7: 
        localavh.uKh = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3745748353024L, 27908);
        return 0;
      }
      localavh.uKD = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3745748353024L, 27908);
      return 0;
    }
    GMTrace.o(3745748353024L, 27908);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\avh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */