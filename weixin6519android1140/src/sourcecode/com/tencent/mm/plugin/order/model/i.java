package com.tencent.mm.plugin.order.model;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class i
  extends com.tencent.mm.bm.a
{
  public String lRT;
  public String nFa;
  public double nFb;
  public String nFc;
  public int nFd;
  public String nFe;
  public int nFf;
  public String nFg;
  public int nFh;
  public int nFi;
  public String nFj;
  public String nFk;
  public String nFl;
  public String nFm;
  public String nFn;
  public int nFo;
  public LinkedList<k> nFp;
  public String nFq;
  public String nFr;
  public double nFs;
  public String nFt;
  
  public i()
  {
    GMTrace.i(6628745150464L, 49388);
    this.nFp = new LinkedList();
    GMTrace.o(6628745150464L, 49388);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6628879368192L, 49389);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nFa != null) {
        paramVarArgs.e(1, this.nFa);
      }
      paramVarArgs.a(2, this.nFb);
      if (this.nFc != null) {
        paramVarArgs.e(3, this.nFc);
      }
      paramVarArgs.fk(4, this.nFd);
      if (this.nFe != null) {
        paramVarArgs.e(5, this.nFe);
      }
      paramVarArgs.fk(6, this.nFf);
      if (this.nFg != null) {
        paramVarArgs.e(7, this.nFg);
      }
      paramVarArgs.fk(8, this.nFh);
      paramVarArgs.fk(9, this.nFi);
      if (this.nFj != null) {
        paramVarArgs.e(10, this.nFj);
      }
      if (this.lRT != null) {
        paramVarArgs.e(11, this.lRT);
      }
      if (this.nFk != null) {
        paramVarArgs.e(12, this.nFk);
      }
      if (this.nFl != null) {
        paramVarArgs.e(13, this.nFl);
      }
      if (this.nFm != null) {
        paramVarArgs.e(14, this.nFm);
      }
      if (this.nFn != null) {
        paramVarArgs.e(15, this.nFn);
      }
      paramVarArgs.fk(16, this.nFo);
      paramVarArgs.d(17, 8, this.nFp);
      if (this.nFq != null) {
        paramVarArgs.e(18, this.nFq);
      }
      if (this.nFr != null) {
        paramVarArgs.e(19, this.nFr);
      }
      paramVarArgs.a(20, this.nFs);
      if (this.nFt != null) {
        paramVarArgs.e(21, this.nFt);
      }
      GMTrace.o(6628879368192L, 49389);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.nFa != null) {
        paramInt = b.a.a.b.b.a.f(1, this.nFa) + 0;
      }
      i = paramInt + (b.a.a.b.b.a.cK(2) + 8);
      paramInt = i;
      if (this.nFc != null) {
        paramInt = i + b.a.a.b.b.a.f(3, this.nFc);
      }
      i = paramInt + b.a.a.a.fh(4, this.nFd);
      paramInt = i;
      if (this.nFe != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.nFe);
      }
      i = paramInt + b.a.a.a.fh(6, this.nFf);
      paramInt = i;
      if (this.nFg != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.nFg);
      }
      i = paramInt + b.a.a.a.fh(8, this.nFh) + b.a.a.a.fh(9, this.nFi);
      paramInt = i;
      if (this.nFj != null) {
        paramInt = i + b.a.a.b.b.a.f(10, this.nFj);
      }
      i = paramInt;
      if (this.lRT != null) {
        i = paramInt + b.a.a.b.b.a.f(11, this.lRT);
      }
      paramInt = i;
      if (this.nFk != null) {
        paramInt = i + b.a.a.b.b.a.f(12, this.nFk);
      }
      i = paramInt;
      if (this.nFl != null) {
        i = paramInt + b.a.a.b.b.a.f(13, this.nFl);
      }
      paramInt = i;
      if (this.nFm != null) {
        paramInt = i + b.a.a.b.b.a.f(14, this.nFm);
      }
      i = paramInt;
      if (this.nFn != null) {
        i = paramInt + b.a.a.b.b.a.f(15, this.nFn);
      }
      i = i + b.a.a.a.fh(16, this.nFo) + b.a.a.a.c(17, 8, this.nFp);
      paramInt = i;
      if (this.nFq != null) {
        paramInt = i + b.a.a.b.b.a.f(18, this.nFq);
      }
      i = paramInt;
      if (this.nFr != null) {
        i = paramInt + b.a.a.b.b.a.f(19, this.nFr);
      }
      i += b.a.a.b.b.a.cK(20) + 8;
      paramInt = i;
      if (this.nFt != null) {
        paramInt = i + b.a.a.b.b.a.f(21, this.nFt);
      }
      GMTrace.o(6628879368192L, 49389);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.nFp.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(6628879368192L, 49389);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      i locali = (i)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(6628879368192L, 49389);
        return -1;
      case 1: 
        locali.nFa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 2: 
        locali.nFb = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 3: 
        locali.nFc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 4: 
        locali.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 5: 
        locali.nFe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 6: 
        locali.nFf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 7: 
        locali.nFg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 8: 
        locali.nFh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 9: 
        locali.nFi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 10: 
        locali.nFj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 11: 
        locali.lRT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 12: 
        locali.nFk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 13: 
        locali.nFl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 14: 
        locali.nFm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 15: 
        locali.nFn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 16: 
        locali.nFo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 17: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new k();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((k)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          locali.nFp.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 18: 
        locali.nFq = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 19: 
        locali.nFr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      case 20: 
        locali.nFs = ((b.a.a.a.a)localObject1).yqV.readDouble();
        GMTrace.o(6628879368192L, 49389);
        return 0;
      }
      locali.nFt = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(6628879368192L, 49389);
      return 0;
    }
    GMTrace.o(6628879368192L, 49389);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\order\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */