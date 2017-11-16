package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;

public final class amc
  extends com.tencent.mm.bm.a
{
  public float aFG;
  public String gCz;
  public String mzo;
  public String pTK;
  public int pTM;
  public int pTO;
  public int score;
  public float tYy;
  public float tYz;
  public String uAX;
  public String uAY;
  public int uAZ;
  public int uBa;
  public b uBb;
  
  public amc()
  {
    GMTrace.i(3845740560384L, 28653);
    GMTrace.o(3845740560384L, 28653);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3845874778112L, 28654);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.n(1, this.tYy);
      paramVarArgs.n(2, this.tYz);
      if (this.gCz != null) {
        paramVarArgs.e(3, this.gCz);
      }
      if (this.mzo != null) {
        paramVarArgs.e(4, this.mzo);
      }
      if (this.pTK != null) {
        paramVarArgs.e(5, this.pTK);
      }
      if (this.uAX != null) {
        paramVarArgs.e(6, this.uAX);
      }
      paramVarArgs.fk(7, this.pTM);
      if (this.uAY != null) {
        paramVarArgs.e(8, this.uAY);
      }
      paramVarArgs.fk(9, this.uAZ);
      paramVarArgs.fk(10, this.uBa);
      paramVarArgs.fk(11, this.pTO);
      paramVarArgs.n(12, this.aFG);
      if (this.uBb != null) {
        paramVarArgs.b(13, this.uBb);
      }
      paramVarArgs.fk(14, this.score);
      GMTrace.o(3845874778112L, 28654);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.b.b.a.cK(1) + 4 + 0 + (b.a.a.b.b.a.cK(2) + 4);
      paramInt = i;
      if (this.gCz != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.gCz);
      }
      i = paramInt;
      if (this.mzo != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.mzo);
      }
      paramInt = i;
      if (this.pTK != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.pTK);
      }
      i = paramInt;
      if (this.uAX != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.uAX);
      }
      i += b.a.a.a.fh(7, this.pTM);
      paramInt = i;
      if (this.uAY != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uAY);
      }
      i = paramInt + b.a.a.a.fh(9, this.uAZ) + b.a.a.a.fh(10, this.uBa) + b.a.a.a.fh(11, this.pTO) + (b.a.a.b.b.a.cK(12) + 4);
      paramInt = i;
      if (this.uBb != null) {
        paramInt = i + b.a.a.a.a(13, this.uBb);
      }
      i = b.a.a.a.fh(14, this.score);
      GMTrace.o(3845874778112L, 28654);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3845874778112L, 28654);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      amc localamc = (amc)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(3845874778112L, 28654);
        return -1;
      case 1: 
        localamc.tYy = locala.yqV.readFloat();
        GMTrace.o(3845874778112L, 28654);
        return 0;
      case 2: 
        localamc.tYz = locala.yqV.readFloat();
        GMTrace.o(3845874778112L, 28654);
        return 0;
      case 3: 
        localamc.gCz = locala.yqV.readString();
        GMTrace.o(3845874778112L, 28654);
        return 0;
      case 4: 
        localamc.mzo = locala.yqV.readString();
        GMTrace.o(3845874778112L, 28654);
        return 0;
      case 5: 
        localamc.pTK = locala.yqV.readString();
        GMTrace.o(3845874778112L, 28654);
        return 0;
      case 6: 
        localamc.uAX = locala.yqV.readString();
        GMTrace.o(3845874778112L, 28654);
        return 0;
      case 7: 
        localamc.pTM = locala.yqV.nj();
        GMTrace.o(3845874778112L, 28654);
        return 0;
      case 8: 
        localamc.uAY = locala.yqV.readString();
        GMTrace.o(3845874778112L, 28654);
        return 0;
      case 9: 
        localamc.uAZ = locala.yqV.nj();
        GMTrace.o(3845874778112L, 28654);
        return 0;
      case 10: 
        localamc.uBa = locala.yqV.nj();
        GMTrace.o(3845874778112L, 28654);
        return 0;
      case 11: 
        localamc.pTO = locala.yqV.nj();
        GMTrace.o(3845874778112L, 28654);
        return 0;
      case 12: 
        localamc.aFG = locala.yqV.readFloat();
        GMTrace.o(3845874778112L, 28654);
        return 0;
      case 13: 
        localamc.uBb = locala.csV();
        GMTrace.o(3845874778112L, 28654);
        return 0;
      }
      localamc.score = locala.yqV.nj();
      GMTrace.o(3845874778112L, 28654);
      return 0;
    }
    GMTrace.o(3845874778112L, 28654);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\amc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */