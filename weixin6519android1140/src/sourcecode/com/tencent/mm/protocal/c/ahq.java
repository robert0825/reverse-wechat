package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class ahq
  extends com.tencent.mm.bm.a
{
  public int jhV;
  public String lPM;
  public String lPi;
  public String tYF;
  public String tYJ;
  public String ugy;
  public String uhC;
  
  public ahq()
  {
    GMTrace.i(3720918073344L, 27723);
    GMTrace.o(3720918073344L, 27723);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3721052291072L, 27724);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uhC != null) {
        paramVarArgs.e(1, this.uhC);
      }
      if (this.lPi != null) {
        paramVarArgs.e(2, this.lPi);
      }
      paramVarArgs.fk(3, this.jhV);
      if (this.ugy != null) {
        paramVarArgs.e(4, this.ugy);
      }
      if (this.tYJ != null) {
        paramVarArgs.e(5, this.tYJ);
      }
      if (this.tYF != null) {
        paramVarArgs.e(6, this.tYF);
      }
      if (this.lPM != null) {
        paramVarArgs.e(7, this.lPM);
      }
      GMTrace.o(3721052291072L, 27724);
      return 0;
    }
    if (paramInt == 1) {
      if (this.uhC == null) {
        break label614;
      }
    }
    label614:
    for (paramInt = b.a.a.b.b.a.f(1, this.uhC) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.lPi != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.lPi);
      }
      i += b.a.a.a.fh(3, this.jhV);
      paramInt = i;
      if (this.ugy != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.ugy);
      }
      i = paramInt;
      if (this.tYJ != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tYJ);
      }
      paramInt = i;
      if (this.tYF != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.tYF);
      }
      i = paramInt;
      if (this.lPM != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.lPM);
      }
      GMTrace.o(3721052291072L, 27724);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3721052291072L, 27724);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        ahq localahq = (ahq)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3721052291072L, 27724);
          return -1;
        case 1: 
          localahq.uhC = locala.yqV.readString();
          GMTrace.o(3721052291072L, 27724);
          return 0;
        case 2: 
          localahq.lPi = locala.yqV.readString();
          GMTrace.o(3721052291072L, 27724);
          return 0;
        case 3: 
          localahq.jhV = locala.yqV.nj();
          GMTrace.o(3721052291072L, 27724);
          return 0;
        case 4: 
          localahq.ugy = locala.yqV.readString();
          GMTrace.o(3721052291072L, 27724);
          return 0;
        case 5: 
          localahq.tYJ = locala.yqV.readString();
          GMTrace.o(3721052291072L, 27724);
          return 0;
        case 6: 
          localahq.tYF = locala.yqV.readString();
          GMTrace.o(3721052291072L, 27724);
          return 0;
        }
        localahq.lPM = locala.yqV.readString();
        GMTrace.o(3721052291072L, 27724);
        return 0;
      }
      GMTrace.o(3721052291072L, 27724);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\ahq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */