package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class gy
  extends com.tencent.mm.bm.a
{
  public String name;
  public String tVO;
  public String tVP;
  public int tVQ;
  public int tVR;
  public String tVS;
  public String tVT;
  public int type;
  public int ver;
  
  public gy()
  {
    GMTrace.i(3775678906368L, 28131);
    GMTrace.o(3775678906368L, 28131);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3775813124096L, 28132);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tVO != null) {
        paramVarArgs.e(1, this.tVO);
      }
      paramVarArgs.fk(2, this.type);
      if (this.tVP != null) {
        paramVarArgs.e(3, this.tVP);
      }
      if (this.name != null) {
        paramVarArgs.e(4, this.name);
      }
      paramVarArgs.fk(5, this.ver);
      paramVarArgs.fk(6, this.tVQ);
      paramVarArgs.fk(7, this.tVR);
      if (this.tVS != null) {
        paramVarArgs.e(8, this.tVS);
      }
      if (this.tVT != null) {
        paramVarArgs.e(9, this.tVT);
      }
      GMTrace.o(3775813124096L, 28132);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tVO == null) {
        break label694;
      }
    }
    label694:
    for (paramInt = b.a.a.b.b.a.f(1, this.tVO) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.type);
      paramInt = i;
      if (this.tVP != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.tVP);
      }
      i = paramInt;
      if (this.name != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.name);
      }
      i = i + b.a.a.a.fh(5, this.ver) + b.a.a.a.fh(6, this.tVQ) + b.a.a.a.fh(7, this.tVR);
      paramInt = i;
      if (this.tVS != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.tVS);
      }
      i = paramInt;
      if (this.tVT != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.tVT);
      }
      GMTrace.o(3775813124096L, 28132);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3775813124096L, 28132);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        gy localgy = (gy)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3775813124096L, 28132);
          return -1;
        case 1: 
          localgy.tVO = locala.yqV.readString();
          GMTrace.o(3775813124096L, 28132);
          return 0;
        case 2: 
          localgy.type = locala.yqV.nj();
          GMTrace.o(3775813124096L, 28132);
          return 0;
        case 3: 
          localgy.tVP = locala.yqV.readString();
          GMTrace.o(3775813124096L, 28132);
          return 0;
        case 4: 
          localgy.name = locala.yqV.readString();
          GMTrace.o(3775813124096L, 28132);
          return 0;
        case 5: 
          localgy.ver = locala.yqV.nj();
          GMTrace.o(3775813124096L, 28132);
          return 0;
        case 6: 
          localgy.tVQ = locala.yqV.nj();
          GMTrace.o(3775813124096L, 28132);
          return 0;
        case 7: 
          localgy.tVR = locala.yqV.nj();
          GMTrace.o(3775813124096L, 28132);
          return 0;
        case 8: 
          localgy.tVS = locala.yqV.readString();
          GMTrace.o(3775813124096L, 28132);
          return 0;
        }
        localgy.tVT = locala.yqV.readString();
        GMTrace.o(3775813124096L, 28132);
        return 0;
      }
      GMTrace.o(3775813124096L, 28132);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\gy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */