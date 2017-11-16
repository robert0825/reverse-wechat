package com.tencent.mm.plugin.wallet.a;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class q
  extends com.tencent.mm.bm.a
{
  public String nEp;
  public String qXt;
  public String qXu;
  public String qXv;
  public int qYi;
  public int qYj;
  public long qYk;
  public String qYl;
  public String qYm;
  public String qYn;
  public double qYo;
  public double qYp;
  public int qYq;
  public String qYr;
  public String qYs;
  public LinkedList<b> qYt;
  
  public q()
  {
    GMTrace.i(7698997313536L, 57362);
    this.qYt = new LinkedList();
    GMTrace.o(7698997313536L, 57362);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(7699131531264L, 57363);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.qYi);
      paramVarArgs.fk(2, this.qYj);
      paramVarArgs.T(3, this.qYk);
      if (this.qYl != null) {
        paramVarArgs.e(4, this.qYl);
      }
      if (this.qXt != null) {
        paramVarArgs.e(5, this.qXt);
      }
      if (this.qYm != null) {
        paramVarArgs.e(6, this.qYm);
      }
      if (this.qYn != null) {
        paramVarArgs.e(7, this.qYn);
      }
      if (this.qXu != null) {
        paramVarArgs.e(8, this.qXu);
      }
      if (this.qXv != null) {
        paramVarArgs.e(9, this.qXv);
      }
      paramVarArgs.a(10, this.qYo);
      paramVarArgs.a(11, this.qYp);
      paramVarArgs.fk(12, this.qYq);
      if (this.qYr != null) {
        paramVarArgs.e(13, this.qYr);
      }
      if (this.nEp != null) {
        paramVarArgs.e(14, this.nEp);
      }
      if (this.qYs != null) {
        paramVarArgs.e(16, this.qYs);
      }
      paramVarArgs.d(17, 6, this.qYt);
      GMTrace.o(7699131531264L, 57363);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = b.a.a.a.fh(1, this.qYi) + 0 + b.a.a.a.fh(2, this.qYj) + b.a.a.a.S(3, this.qYk);
      paramInt = i;
      if (this.qYl != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.qYl);
      }
      i = paramInt;
      if (this.qXt != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.qXt);
      }
      paramInt = i;
      if (this.qYm != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.qYm);
      }
      i = paramInt;
      if (this.qYn != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.qYn);
      }
      paramInt = i;
      if (this.qXu != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.qXu);
      }
      i = paramInt;
      if (this.qXv != null) {
        i = paramInt + b.a.a.b.b.a.f(9, this.qXv);
      }
      i = i + (b.a.a.b.b.a.cK(10) + 8) + (b.a.a.b.b.a.cK(11) + 8) + b.a.a.a.fh(12, this.qYq);
      paramInt = i;
      if (this.qYr != null) {
        paramInt = i + b.a.a.b.b.a.f(13, this.qYr);
      }
      i = paramInt;
      if (this.nEp != null) {
        i = paramInt + b.a.a.b.b.a.f(14, this.nEp);
      }
      paramInt = i;
      if (this.qYs != null) {
        paramInt = i + b.a.a.b.b.a.f(16, this.qYs);
      }
      i = b.a.a.a.c(17, 6, this.qYt);
      GMTrace.o(7699131531264L, 57363);
      return paramInt + i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.qYt.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(7699131531264L, 57363);
      return 0;
    }
    if (paramInt == 3)
    {
      b.a.a.a.a locala = (b.a.a.a.a)paramVarArgs[0];
      q localq = (q)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      case 15: 
      default: 
        GMTrace.o(7699131531264L, 57363);
        return -1;
      case 1: 
        localq.qYi = locala.yqV.nj();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 2: 
        localq.qYj = locala.yqV.nj();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 3: 
        localq.qYk = locala.yqV.nk();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 4: 
        localq.qYl = locala.yqV.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 5: 
        localq.qXt = locala.yqV.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 6: 
        localq.qYm = locala.yqV.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 7: 
        localq.qYn = locala.yqV.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 8: 
        localq.qXu = locala.yqV.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 9: 
        localq.qXv = locala.yqV.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 10: 
        localq.qYo = locala.yqV.readDouble();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 11: 
        localq.qYp = locala.yqV.readDouble();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 12: 
        localq.qYq = locala.yqV.nj();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 13: 
        localq.qYr = locala.yqV.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 14: 
        localq.nEp = locala.yqV.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      case 16: 
        localq.qYs = locala.yqV.readString();
        GMTrace.o(7699131531264L, 57363);
        return 0;
      }
      localq.qYt.add(locala.csV());
      GMTrace.o(7699131531264L, 57363);
      return 0;
    }
    GMTrace.o(7699131531264L, 57363);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */