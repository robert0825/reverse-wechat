package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class brd
  extends ayx
{
  public int jib;
  public int tWu;
  public String tXx;
  public int uJY;
  public String uqq;
  public int vaT;
  public int vaU;
  public double vaV;
  public double vaW;
  public String vaX;
  public String vaY;
  public String vaZ;
  public String vba;
  public int vbb;
  public String vbc;
  
  public brd()
  {
    GMTrace.i(3958886105088L, 29496);
    this.vaU = 2;
    GMTrace.o(3958886105088L, 29496);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3959020322816L, 29497);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.uqq != null) {
        paramVarArgs.e(2, this.uqq);
      }
      paramVarArgs.fk(3, this.tWu);
      paramVarArgs.fk(4, this.vaT);
      if (this.tXx != null) {
        paramVarArgs.e(5, this.tXx);
      }
      paramVarArgs.fk(6, this.vaU);
      paramVarArgs.a(7, this.vaV);
      paramVarArgs.a(8, this.vaW);
      paramVarArgs.fk(9, this.jib);
      paramVarArgs.fk(10, this.uJY);
      if (this.vaX != null) {
        paramVarArgs.e(99, this.vaX);
      }
      if (this.vaY != null) {
        paramVarArgs.e(100, this.vaY);
      }
      if (this.vaZ != null) {
        paramVarArgs.e(101, this.vaZ);
      }
      if (this.vba != null) {
        paramVarArgs.e(102, this.vba);
      }
      paramVarArgs.fk(103, this.vbb);
      if (this.vbc != null) {
        paramVarArgs.e(104, this.vbc);
      }
      GMTrace.o(3959020322816L, 29497);
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
      if (this.uqq != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.uqq);
      }
      i = i + b.a.a.a.fh(3, this.tWu) + b.a.a.a.fh(4, this.vaT);
      paramInt = i;
      if (this.tXx != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.tXx);
      }
      i = paramInt + b.a.a.a.fh(6, this.vaU) + (b.a.a.b.b.a.cK(7) + 8) + (b.a.a.b.b.a.cK(8) + 8) + b.a.a.a.fh(9, this.jib) + b.a.a.a.fh(10, this.uJY);
      paramInt = i;
      if (this.vaX != null) {
        paramInt = i + b.a.a.b.b.a.f(99, this.vaX);
      }
      i = paramInt;
      if (this.vaY != null) {
        i = paramInt + b.a.a.b.b.a.f(100, this.vaY);
      }
      paramInt = i;
      if (this.vaZ != null) {
        paramInt = i + b.a.a.b.b.a.f(101, this.vaZ);
      }
      i = paramInt;
      if (this.vba != null) {
        i = paramInt + b.a.a.b.b.a.f(102, this.vba);
      }
      i += b.a.a.a.fh(103, this.vbb);
      paramInt = i;
      if (this.vbc != null) {
        paramInt = i + b.a.a.b.b.a.f(104, this.vbc);
      }
      GMTrace.o(3959020322816L, 29497);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3959020322816L, 29497);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      brd localbrd = (brd)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3959020322816L, 29497);
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
          localbrd.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 2: 
        localbrd.uqq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 3: 
        localbrd.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 4: 
        localbrd.vaT = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 5: 
        localbrd.tXx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 6: 
        localbrd.vaU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 7: 
        localbrd.vaV = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 8: 
        localbrd.vaW = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 9: 
        localbrd.jib = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 10: 
        localbrd.uJY = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 99: 
        localbrd.vaX = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 100: 
        localbrd.vaY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 101: 
        localbrd.vaZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 102: 
        localbrd.vba = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      case 103: 
        localbrd.vbb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3959020322816L, 29497);
        return 0;
      }
      localbrd.vbc = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3959020322816L, 29497);
      return 0;
    }
    GMTrace.o(3959020322816L, 29497);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\brd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */