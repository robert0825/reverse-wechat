package com.tencent.mm.plugin.game.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class cn
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPD;
  public String lPE;
  public String lRR;
  public String lRY;
  public String lSc;
  public String lTa;
  public String lTb;
  public int lTc;
  public String lTd;
  public String lTe;
  public String lTf;
  public String lTg;
  
  public cn()
  {
    GMTrace.i(19276350095360L, 143620);
    GMTrace.o(19276350095360L, 143620);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(19276484313088L, 143621);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      if (this.lSc != null) {
        paramVarArgs.e(2, this.lSc);
      }
      if (this.lTa != null) {
        paramVarArgs.e(3, this.lTa);
      }
      if (this.lTb != null) {
        paramVarArgs.e(4, this.lTb);
      }
      if (this.lPD != null) {
        paramVarArgs.e(5, this.lPD);
      }
      if (this.lRR != null) {
        paramVarArgs.e(6, this.lRR);
      }
      paramVarArgs.fk(7, this.lTc);
      if (this.lPE != null) {
        paramVarArgs.e(8, this.lPE);
      }
      if (this.lTd != null) {
        paramVarArgs.e(9, this.lTd);
      }
      if (this.lTe != null) {
        paramVarArgs.e(10, this.lTe);
      }
      if (this.lTf != null) {
        paramVarArgs.e(11, this.lTf);
      }
      if (this.lRY != null) {
        paramVarArgs.e(12, this.lRY);
      }
      if (this.lTg != null) {
        paramVarArgs.e(13, this.lTg);
      }
      GMTrace.o(19276484313088L, 143621);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eBt == null) {
        break label1027;
      }
    }
    label1027:
    for (int i = b.a.a.b.b.a.f(1, this.eBt) + 0;; i = 0)
    {
      paramInt = i;
      if (this.lSc != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lSc);
      }
      i = paramInt;
      if (this.lTa != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.lTa);
      }
      paramInt = i;
      if (this.lTb != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.lTb);
      }
      i = paramInt;
      if (this.lPD != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.lPD);
      }
      paramInt = i;
      if (this.lRR != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.lRR);
      }
      i = paramInt + b.a.a.a.fh(7, this.lTc);
      paramInt = i;
      if (this.lPE != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.lPE);
      }
      i = paramInt;
      if (this.lTd != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.lTd);
      }
      paramInt = i;
      if (this.lTe != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.lTe);
      }
      i = paramInt;
      if (this.lTf != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.lTf);
      }
      paramInt = i;
      if (this.lRY != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.lRY);
      }
      i = paramInt;
      if (this.lTg != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.lTg);
      }
      GMTrace.o(19276484313088L, 143621);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.eBt == null) {
          throw new b("Not all required fields were included: Title");
        }
        GMTrace.o(19276484313088L, 143621);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        cn localcn = (cn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(19276484313088L, 143621);
          return -1;
        case 1: 
          localcn.eBt = locala.yqV.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 2: 
          localcn.lSc = locala.yqV.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 3: 
          localcn.lTa = locala.yqV.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 4: 
          localcn.lTb = locala.yqV.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 5: 
          localcn.lPD = locala.yqV.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 6: 
          localcn.lRR = locala.yqV.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 7: 
          localcn.lTc = locala.yqV.nj();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 8: 
          localcn.lPE = locala.yqV.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 9: 
          localcn.lTd = locala.yqV.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 10: 
          localcn.lTe = locala.yqV.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 11: 
          localcn.lTf = locala.yqV.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        case 12: 
          localcn.lRY = locala.yqV.readString();
          GMTrace.o(19276484313088L, 143621);
          return 0;
        }
        localcn.lTg = locala.yqV.readString();
        GMTrace.o(19276484313088L, 143621);
        return 0;
      }
      GMTrace.o(19276484313088L, 143621);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\c\cn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */