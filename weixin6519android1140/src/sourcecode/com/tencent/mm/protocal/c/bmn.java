package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bmn
  extends ayx
{
  public String lSX;
  public String lSY;
  public int tPV;
  public String tQN;
  public String tQb;
  public long tQd;
  public int tTL;
  public int tWu;
  public int uCG;
  public int uWx;
  public int uWy;
  public azp ues;
  public int ugP;
  public int ugl;
  public int ugn;
  public int ugo;
  
  public bmn()
  {
    GMTrace.i(3649380024320L, 27190);
    GMTrace.o(3649380024320L, 27190);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3649514242048L, 27191);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      if (this.lSY != null) {
        paramVarArgs.e(1, this.lSY);
      }
      if (this.lSX != null) {
        paramVarArgs.e(2, this.lSX);
      }
      paramVarArgs.fk(3, this.tWu);
      paramVarArgs.fk(4, this.ugl);
      if (this.tQN != null) {
        paramVarArgs.e(5, this.tQN);
      }
      paramVarArgs.fk(6, this.tPV);
      paramVarArgs.fk(7, this.ugn);
      if (this.ues != null)
      {
        paramVarArgs.fm(8, this.ues.aYq());
        this.ues.a(paramVarArgs);
      }
      paramVarArgs.fk(9, this.tTL);
      if (this.uNh != null)
      {
        paramVarArgs.fm(10, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      paramVarArgs.fk(11, this.ugo);
      if (this.tQb != null) {
        paramVarArgs.e(12, this.tQb);
      }
      paramVarArgs.fk(13, this.uCG);
      paramVarArgs.fk(14, this.uWx);
      paramVarArgs.fk(15, this.uWy);
      paramVarArgs.T(16, this.tQd);
      paramVarArgs.fk(17, this.ugP);
      GMTrace.o(3649514242048L, 27191);
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
      i = i + b.a.a.a.fh(3, this.tWu) + b.a.a.a.fh(4, this.ugl);
      paramInt = i;
      if (this.tQN != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tQN);
      }
      i = paramInt + b.a.a.a.fh(6, this.tPV) + b.a.a.a.fh(7, this.ugn);
      paramInt = i;
      if (this.ues != null) {
        paramInt = i + b.a.a.a.fj(8, this.ues.aYq());
      }
      i = paramInt + b.a.a.a.fh(9, this.tTL);
      paramInt = i;
      if (this.uNh != null) {
        paramInt = i + b.a.a.a.fj(10, this.uNh.aYq());
      }
      i = paramInt + b.a.a.a.fh(11, this.ugo);
      paramInt = i;
      if (this.tQb != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.tQb);
      }
      i = b.a.a.a.fh(13, this.uCG);
      int j = b.a.a.a.fh(14, this.uWx);
      int k = b.a.a.a.fh(15, this.uWy);
      int m = b.a.a.a.S(16, this.tQd);
      int n = b.a.a.a.fh(17, this.ugP);
      GMTrace.o(3649514242048L, 27191);
      return paramInt + i + j + k + m + n;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.ues == null) {
        throw new b("Not all required fields were included: Data");
      }
      GMTrace.o(3649514242048L, 27191);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bmn localbmn = (bmn)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3649514242048L, 27191);
        return -1;
      case 1: 
        localbmn.lSY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 2: 
        localbmn.lSX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 3: 
        localbmn.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 4: 
        localbmn.ugl = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 5: 
        localbmn.tQN = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 6: 
        localbmn.tPV = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 7: 
        localbmn.ugn = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 8: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbmn.ues = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 9: 
        localbmn.tTL = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbmn.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 11: 
        localbmn.ugo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 12: 
        localbmn.tQb = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 13: 
        localbmn.uCG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 14: 
        localbmn.uWx = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 15: 
        localbmn.uWy = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      case 16: 
        localbmn.tQd = ((b.a.a.a.a)localObject1).yqV.nk();
        GMTrace.o(3649514242048L, 27191);
        return 0;
      }
      localbmn.ugP = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(3649514242048L, 27191);
      return 0;
    }
    GMTrace.o(3649514242048L, 27191);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bmn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */