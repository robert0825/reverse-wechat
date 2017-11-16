package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class asz
  extends com.tencent.mm.bm.a
{
  public String lRT;
  public String nFa;
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
  public LinkedList<bec> nFp;
  public int uIS;
  
  public asz()
  {
    GMTrace.i(3851646140416L, 28697);
    this.nFp = new LinkedList();
    GMTrace.o(3851646140416L, 28697);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3851780358144L, 28698);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.nFa != null) {
        paramVarArgs.e(1, this.nFa);
      }
      paramVarArgs.fk(2, this.uIS);
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
      GMTrace.o(3851780358144L, 28698);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.nFa != null) {
        paramInt = b.a.a.b.b.a.f(1, this.nFa) + 0;
      }
      i = paramInt + b.a.a.a.fh(2, this.uIS);
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
      paramInt = b.a.a.a.fh(16, this.nFo);
      int j = b.a.a.a.c(17, 8, this.nFp);
      GMTrace.o(3851780358144L, 28698);
      return i + paramInt + j;
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
      GMTrace.o(3851780358144L, 28698);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      asz localasz = (asz)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3851780358144L, 28698);
        return -1;
      case 1: 
        localasz.nFa = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 2: 
        localasz.uIS = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 3: 
        localasz.nFc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 4: 
        localasz.nFd = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 5: 
        localasz.nFe = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 6: 
        localasz.nFf = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 7: 
        localasz.nFg = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 8: 
        localasz.nFh = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 9: 
        localasz.nFi = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 10: 
        localasz.nFj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 11: 
        localasz.lRT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 12: 
        localasz.nFk = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 13: 
        localasz.nFl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 14: 
        localasz.nFm = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 15: 
        localasz.nFn = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      case 16: 
        localasz.nFo = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3851780358144L, 28698);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        Object localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new bec();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (boolean bool = true; bool; bool = ((bec)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localasz.nFp.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3851780358144L, 28698);
      return 0;
    }
    GMTrace.o(3851780358144L, 28698);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\asz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */