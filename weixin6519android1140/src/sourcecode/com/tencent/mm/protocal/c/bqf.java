package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bqf
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String tRS;
  public String uJL;
  public int vao;
  public String vap;
  public String vaq;
  public String var;
  public String vas;
  public String vat;
  
  public bqf()
  {
    GMTrace.i(3777826390016L, 28147);
    GMTrace.o(3777826390016L, 28147);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3777960607744L, 28148);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      if (this.tRS != null) {
        paramVarArgs.e(2, this.tRS);
      }
      paramVarArgs.fk(3, this.vao);
      if (this.vap != null) {
        paramVarArgs.e(4, this.vap);
      }
      if (this.uJL != null) {
        paramVarArgs.e(5, this.uJL);
      }
      if (this.vaq != null) {
        paramVarArgs.e(6, this.vaq);
      }
      if (this.var != null) {
        paramVarArgs.e(7, this.var);
      }
      if (this.vas != null) {
        paramVarArgs.e(8, this.vas);
      }
      if (this.vat != null) {
        paramVarArgs.e(9, this.vat);
      }
      GMTrace.o(3777960607744L, 28148);
      return 0;
    }
    if (paramInt == 1) {
      if (this.eBt == null) {
        break label746;
      }
    }
    label746:
    for (paramInt = b.a.a.b.b.a.f(1, this.eBt) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.tRS != null) {
        i = paramInt + b.a.a.b.b.a.f(2, this.tRS);
      }
      i += b.a.a.a.fh(3, this.vao);
      paramInt = i;
      if (this.vap != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.vap);
      }
      i = paramInt;
      if (this.uJL != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.uJL);
      }
      paramInt = i;
      if (this.vaq != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.vaq);
      }
      i = paramInt;
      if (this.var != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.var);
      }
      paramInt = i;
      if (this.vas != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.vas);
      }
      i = paramInt;
      if (this.vat != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.vat);
      }
      GMTrace.o(3777960607744L, 28148);
      return i;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        GMTrace.o(3777960607744L, 28148);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bqf localbqf = (bqf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3777960607744L, 28148);
          return -1;
        case 1: 
          localbqf.eBt = locala.yqV.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 2: 
          localbqf.tRS = locala.yqV.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 3: 
          localbqf.vao = locala.yqV.nj();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 4: 
          localbqf.vap = locala.yqV.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 5: 
          localbqf.uJL = locala.yqV.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 6: 
          localbqf.vaq = locala.yqV.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 7: 
          localbqf.var = locala.yqV.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        case 8: 
          localbqf.vas = locala.yqV.readString();
          GMTrace.o(3777960607744L, 28148);
          return 0;
        }
        localbqf.vat = locala.yqV.readString();
        GMTrace.o(3777960607744L, 28148);
        return 0;
      }
      GMTrace.o(3777960607744L, 28148);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bqf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */