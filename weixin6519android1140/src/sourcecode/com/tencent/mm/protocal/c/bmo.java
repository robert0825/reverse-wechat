package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bmo
  extends azh
{
  public String lSX;
  public String lSY;
  public int nFd;
  public int tPV;
  public String tQN;
  public long tQd;
  public int tTL;
  public int tWu;
  public int ugl;
  public int ugn;
  public int ugo;
  
  public bmo()
  {
    GMTrace.i(3985595432960L, 29695);
    GMTrace.o(3985595432960L, 29695);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3985729650688L, 29696);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.lSY != null) {
        paramVarArgs.e(1, this.lSY);
      }
      if (this.lSX != null) {
        paramVarArgs.e(2, this.lSX);
      }
      paramVarArgs.fk(3, this.tWu);
      paramVarArgs.fk(4, this.ugl);
      paramVarArgs.fk(5, this.nFd);
      if (this.tQN != null) {
        paramVarArgs.e(6, this.tQN);
      }
      paramVarArgs.fk(7, this.tPV);
      paramVarArgs.fk(8, this.ugn);
      paramVarArgs.fk(9, this.tTL);
      if (this.uND != null)
      {
        paramVarArgs.fm(10, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      paramVarArgs.fk(11, this.ugo);
      paramVarArgs.T(12, this.tQd);
      GMTrace.o(3985729650688L, 29696);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.lSY != null) {
        paramInt = b.a.a.b.b.a.f(1, this.lSY) + 0;
      }
      i = paramInt;
      if (this.lSX != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lSX);
      }
      i = i + b.a.a.a.fh(3, this.tWu) + b.a.a.a.fh(4, this.ugl) + b.a.a.a.fh(5, this.nFd);
      paramInt = i;
      if (this.tQN != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tQN);
      }
      i = paramInt + b.a.a.a.fh(7, this.tPV) + b.a.a.a.fh(8, this.ugn) + b.a.a.a.fh(9, this.tTL);
      paramInt = i;
      if (this.uND != null) {
        paramInt = i + b.a.a.a.fj(10, this.uND.aYq());
      }
      i = b.a.a.a.fh(11, this.ugo);
      int j = b.a.a.a.S(12, this.tQd);
      GMTrace.o(3985729650688L, 29696);
      return paramInt + i + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(3985729650688L, 29696);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bmo localbmo = (bmo)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3985729650688L, 29696);
        return -1;
      case 1: 
        localbmo.lSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3985729650688L, 29696);
        return 0;
      case 2: 
        localbmo.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3985729650688L, 29696);
        return 0;
      case 3: 
        localbmo.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3985729650688L, 29696);
        return 0;
      case 4: 
        localbmo.ugl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3985729650688L, 29696);
        return 0;
      case 5: 
        localbmo.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3985729650688L, 29696);
        return 0;
      case 6: 
        localbmo.tQN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3985729650688L, 29696);
        return 0;
      case 7: 
        localbmo.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3985729650688L, 29696);
        return 0;
      case 8: 
        localbmo.ugn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3985729650688L, 29696);
        return 0;
      case 9: 
        localbmo.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3985729650688L, 29696);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localbmo.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3985729650688L, 29696);
        return 0;
      case 11: 
        localbmo.ugo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3985729650688L, 29696);
        return 0;
      }
      localbmo.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
      GMTrace.o(3985729650688L, 29696);
      return 0;
    }
    GMTrace.o(3985729650688L, 29696);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bmo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */