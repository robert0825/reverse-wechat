package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ahk
  extends com.tencent.mm.bm.a
{
  public String ojk;
  public int state;
  public String tXo;
  public String title;
  public String uwP;
  public long uwQ;
  public String uwR;
  public String uwS;
  public String uwT;
  
  public ahk()
  {
    GMTrace.i(20861193027584L, 155428);
    GMTrace.o(20861193027584L, 155428);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20861327245312L, 155429);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tXo != null) {
        paramVarArgs.e(1, this.tXo);
      }
      paramVarArgs.fk(2, this.state);
      if (this.title != null) {
        paramVarArgs.e(3, this.title);
      }
      if (this.uwP != null) {
        paramVarArgs.e(4, this.uwP);
      }
      paramVarArgs.T(5, this.uwQ);
      if (this.uwR != null) {
        paramVarArgs.e(6, this.uwR);
      }
      if (this.ojk != null) {
        paramVarArgs.e(7, this.ojk);
      }
      if (this.uwS != null) {
        paramVarArgs.e(8, this.uwS);
      }
      if (this.uwT != null) {
        paramVarArgs.e(9, this.uwT);
      }
      GMTrace.o(20861327245312L, 155429);
      return 0;
    }
    if (paramInt == 1) {
      if (this.tXo == null) {
        break label715;
      }
    }
    label715:
    for (paramInt = b.a.a.b.b.a.f(1, this.tXo) + 0;; paramInt = 0)
    {
      int i = paramInt + b.a.a.a.fh(2, this.state);
      paramInt = i;
      if (this.title != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.title);
      }
      i = paramInt;
      if (this.uwP != null) {
        i = paramInt + b.a.a.b.b.a.f(4, this.uwP);
      }
      i += b.a.a.a.S(5, this.uwQ);
      paramInt = i;
      if (this.uwR != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uwR);
      }
      i = paramInt;
      if (this.ojk != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.ojk);
      }
      paramInt = i;
      if (this.uwS != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uwS);
      }
      i = paramInt;
      if (this.uwT != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.uwT);
      }
      GMTrace.o(20861327245312L, 155429);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(20861327245312L, 155429);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ahk localahk = (ahk)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(20861327245312L, 155429);
          return -1;
        case 1: 
          localahk.tXo = locala.yqV.readString();
          GMTrace.o(20861327245312L, 155429);
          return 0;
        case 2: 
          localahk.state = locala.yqV.nj();
          GMTrace.o(20861327245312L, 155429);
          return 0;
        case 3: 
          localahk.title = locala.yqV.readString();
          GMTrace.o(20861327245312L, 155429);
          return 0;
        case 4: 
          localahk.uwP = locala.yqV.readString();
          GMTrace.o(20861327245312L, 155429);
          return 0;
        case 5: 
          localahk.uwQ = locala.yqV.nk();
          GMTrace.o(20861327245312L, 155429);
          return 0;
        case 6: 
          localahk.uwR = locala.yqV.readString();
          GMTrace.o(20861327245312L, 155429);
          return 0;
        case 7: 
          localahk.ojk = locala.yqV.readString();
          GMTrace.o(20861327245312L, 155429);
          return 0;
        case 8: 
          localahk.uwS = locala.yqV.readString();
          GMTrace.o(20861327245312L, 155429);
          return 0;
        }
        localahk.uwT = locala.yqV.readString();
        GMTrace.o(20861327245312L, 155429);
        return 0;
      }
      GMTrace.o(20861327245312L, 155429);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ahk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */