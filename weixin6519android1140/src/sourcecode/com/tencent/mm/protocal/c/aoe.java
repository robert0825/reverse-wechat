package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class aoe
  extends azh
{
  public int jib;
  public int nFd;
  public int tPV;
  public azq tPX;
  public long tQd;
  public int tST;
  public int uEe;
  public int uEf;
  
  public aoe()
  {
    GMTrace.i(13339765768192L, 99389);
    GMTrace.o(13339765768192L, 99389);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13339899985920L, 99390);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      paramVarArgs.fk(1, this.tST);
      if (this.tPX != null)
      {
        paramVarArgs.fm(2, this.tPX.aYq());
        this.tPX.a(paramVarArgs);
      }
      paramVarArgs.fk(3, this.tPV);
      paramVarArgs.fk(4, this.uEe);
      paramVarArgs.fk(5, this.nFd);
      paramVarArgs.fk(6, this.uEf);
      paramVarArgs.fk(7, this.jib);
      paramVarArgs.T(8, this.tQd);
      GMTrace.o(13339899985920L, 99390);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tST) + 0;
      paramInt = i;
      if (this.tPX != null) {
        paramInt = i + b.a.a.a.fj(2, this.tPX.aYq());
      }
      i = b.a.a.a.fh(3, this.tPV);
      int j = b.a.a.a.fh(4, this.uEe);
      int k = b.a.a.a.fh(5, this.nFd);
      int m = b.a.a.a.fh(6, this.uEf);
      int n = b.a.a.a.fh(7, this.jib);
      int i1 = b.a.a.a.S(8, this.tQd);
      GMTrace.o(13339899985920L, 99390);
      return paramInt + i + j + k + m + n + i1;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tPX == null) {
        throw new b("Not all required fields were included: ToUserName");
      }
      GMTrace.o(13339899985920L, 99390);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aoe localaoe = (aoe)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(13339899985920L, 99390);
        return -1;
      case 1: 
        localaoe.tST = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13339899985920L, 99390);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((azq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localaoe.tPX = ((azq)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13339899985920L, 99390);
        return 0;
      case 3: 
        localaoe.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13339899985920L, 99390);
        return 0;
      case 4: 
        localaoe.uEe = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13339899985920L, 99390);
        return 0;
      case 5: 
        localaoe.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13339899985920L, 99390);
        return 0;
      case 6: 
        localaoe.uEf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13339899985920L, 99390);
        return 0;
      case 7: 
        localaoe.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(13339899985920L, 99390);
        return 0;
      }
      localaoe.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(13339899985920L, 99390);
      return 0;
    }
    GMTrace.o(13339899985920L, 99390);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aoe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */