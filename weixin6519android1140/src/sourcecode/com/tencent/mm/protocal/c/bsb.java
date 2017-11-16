package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;

public final class bsb
  extends com.tencent.mm.bm.a
{
  public String fsN;
  public String jhn;
  public int tQM;
  public String ueB;
  public String vbo;
  public String vbp;
  public String vbq;
  public String vbr;
  public String vbs;
  public String vbt;
  
  public bsb()
  {
    GMTrace.i(3755277811712L, 27979);
    GMTrace.o(3755277811712L, 27979);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3755412029440L, 27980);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.vbo == null) {
        throw new b("Not all required fields were included: LocalNodeId");
      }
      if (this.vbo != null) {
        paramVarArgs.e(1, this.vbo);
      }
      if (this.jhn != null) {
        paramVarArgs.e(2, this.jhn);
      }
      if (this.vbp != null) {
        paramVarArgs.e(3, this.vbp);
      }
      if (this.fsN != null) {
        paramVarArgs.e(4, this.fsN);
      }
      if (this.vbq != null) {
        paramVarArgs.e(5, this.vbq);
      }
      if (this.ueB != null) {
        paramVarArgs.e(6, this.ueB);
      }
      if (this.vbr != null) {
        paramVarArgs.e(7, this.vbr);
      }
      if (this.vbs != null) {
        paramVarArgs.e(8, this.vbs);
      }
      if (this.vbt != null) {
        paramVarArgs.e(9, this.vbt);
      }
      paramVarArgs.fk(10, this.tQM);
      GMTrace.o(3755412029440L, 27980);
      return 0;
    }
    if (paramInt == 1) {
      if (this.vbo == null) {
        break label846;
      }
    }
    label846:
    for (int i = b.a.a.b.b.a.f(1, this.vbo) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jhn != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.jhn);
      }
      i = paramInt;
      if (this.vbp != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.vbp);
      }
      paramInt = i;
      if (this.fsN != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.fsN);
      }
      i = paramInt;
      if (this.vbq != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.vbq);
      }
      paramInt = i;
      if (this.ueB != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.ueB);
      }
      i = paramInt;
      if (this.vbr != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.vbr);
      }
      paramInt = i;
      if (this.vbs != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.vbs);
      }
      i = paramInt;
      if (this.vbt != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.vbt);
      }
      paramInt = b.a.a.a.fh(10, this.tQM);
      GMTrace.o(3755412029440L, 27980);
      return i + paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.csW();
          }
        }
        if (this.vbo == null) {
          throw new b("Not all required fields were included: LocalNodeId");
        }
        GMTrace.o(3755412029440L, 27980);
        return 0;
      }
      if (paramInt == 3)
      {
        b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
        bsb localbsb = (bsb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          GMTrace.o(3755412029440L, 27980);
          return -1;
        case 1: 
          localbsb.vbo = locala.yqV.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 2: 
          localbsb.jhn = locala.yqV.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 3: 
          localbsb.vbp = locala.yqV.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 4: 
          localbsb.fsN = locala.yqV.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 5: 
          localbsb.vbq = locala.yqV.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 6: 
          localbsb.ueB = locala.yqV.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 7: 
          localbsb.vbr = locala.yqV.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 8: 
          localbsb.vbs = locala.yqV.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        case 9: 
          localbsb.vbt = locala.yqV.readString();
          GMTrace.o(3755412029440L, 27980);
          return 0;
        }
        localbsb.tQM = locala.yqV.nj();
        GMTrace.o(3755412029440L, 27980);
        return 0;
      }
      GMTrace.o(3755412029440L, 27980);
      return -1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bsb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */