package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;

public final class bus
  extends com.tencent.mm.bm.a
{
  public int eVi;
  public String eVj;
  public String iyC;
  public int iyH;
  public int jib;
  public int kBw;
  public String lQa;
  public int oqG;
  public int oqH;
  public int rBN;
  public int vcS;
  public String vdd;
  public String vde;
  public String vdf;
  public String vdg;
  public int vdh;
  public String vdi;
  
  public bus()
  {
    GMTrace.i(4051227901952L, 30184);
    GMTrace.o(4051227901952L, 30184);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(4051362119680L, 30185);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.jib);
      if (this.lQa != null) {
        paramVarArgs.e(2, this.lQa);
      }
      if (this.vdd != null) {
        paramVarArgs.e(3, this.vdd);
      }
      paramVarArgs.fk(4, this.oqG);
      paramVarArgs.fk(5, this.kBw);
      paramVarArgs.fk(6, this.oqH);
      if (this.vde != null) {
        paramVarArgs.e(7, this.vde);
      }
      paramVarArgs.fk(8, this.vcS);
      if (this.vdf != null) {
        paramVarArgs.e(9, this.vdf);
      }
      if (this.vdg != null) {
        paramVarArgs.e(10, this.vdg);
      }
      paramVarArgs.fk(11, this.rBN);
      paramVarArgs.fk(12, this.vdh);
      if (this.vdi != null) {
        paramVarArgs.e(13, this.vdi);
      }
      if (this.iyC != null) {
        paramVarArgs.e(14, this.iyC);
      }
      paramVarArgs.fk(15, this.eVi);
      if (this.eVj != null) {
        paramVarArgs.e(16, this.eVj);
      }
      paramVarArgs.fk(17, this.iyH);
      GMTrace.o(4051362119680L, 30185);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.jib) + 0;
      paramInt = i;
      if (this.lQa != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lQa);
      }
      i = paramInt;
      if (this.vdd != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.vdd);
      }
      i = i + b.a.a.a.fh(4, this.oqG) + b.a.a.a.fh(5, this.kBw) + b.a.a.a.fh(6, this.oqH);
      paramInt = i;
      if (this.vde != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.vde);
      }
      i = paramInt + b.a.a.a.fh(8, this.vcS);
      paramInt = i;
      if (this.vdf != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.vdf);
      }
      i = paramInt;
      if (this.vdg != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.vdg);
      }
      i = i + b.a.a.a.fh(11, this.rBN) + b.a.a.a.fh(12, this.vdh);
      paramInt = i;
      if (this.vdi != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.vdi);
      }
      i = paramInt;
      if (this.iyC != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.iyC);
      }
      i += b.a.a.a.fh(15, this.eVi);
      paramInt = i;
      if (this.eVj != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.eVj);
      }
      i = b.a.a.a.fh(17, this.iyH);
      GMTrace.o(4051362119680L, 30185);
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
      GMTrace.o(4051362119680L, 30185);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      bus localbus = (bus)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        GMTrace.o(4051362119680L, 30185);
        return -1;
      case 1: 
        localbus.jib = locala.yqV.nj();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 2: 
        localbus.lQa = locala.yqV.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 3: 
        localbus.vdd = locala.yqV.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 4: 
        localbus.oqG = locala.yqV.nj();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 5: 
        localbus.kBw = locala.yqV.nj();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 6: 
        localbus.oqH = locala.yqV.nj();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 7: 
        localbus.vde = locala.yqV.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 8: 
        localbus.vcS = locala.yqV.nj();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 9: 
        localbus.vdf = locala.yqV.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 10: 
        localbus.vdg = locala.yqV.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 11: 
        localbus.rBN = locala.yqV.nj();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 12: 
        localbus.vdh = locala.yqV.nj();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 13: 
        localbus.vdi = locala.yqV.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 14: 
        localbus.iyC = locala.yqV.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 15: 
        localbus.eVi = locala.yqV.nj();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      case 16: 
        localbus.eVj = locala.yqV.readString();
        GMTrace.o(4051362119680L, 30185);
        return 0;
      }
      localbus.iyH = locala.yqV.nj();
      GMTrace.o(4051362119680L, 30185);
      return 0;
    }
    GMTrace.o(4051362119680L, 30185);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\bus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */