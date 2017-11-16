package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bli
  extends ayx
{
  public int aJb;
  public String eEl;
  public String esG;
  public String gjJ;
  public String uOc;
  public int uVq;
  public int uVr;
  public String uVs;
  public int uVt;
  public String uVu;
  public LinkedList<bha> uVv;
  public int uVw;
  public int uVx;
  
  public bli()
  {
    GMTrace.i(16741916737536L, 124737);
    this.uVv = new LinkedList();
    GMTrace.o(16741916737536L, 124737);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(16742050955264L, 124738);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.esG != null) {
        paramVarArgs.e(2, this.esG);
      }
      if (this.eEl != null) {
        paramVarArgs.e(3, this.eEl);
      }
      paramVarArgs.fk(4, this.uVq);
      paramVarArgs.fk(5, this.uVr);
      paramVarArgs.fk(6, this.aJb);
      if (this.uVs != null) {
        paramVarArgs.e(7, this.uVs);
      }
      if (this.uOc != null) {
        paramVarArgs.e(8, this.uOc);
      }
      if (this.gjJ != null) {
        paramVarArgs.e(9, this.gjJ);
      }
      paramVarArgs.fk(10, this.uVt);
      if (this.uVu != null) {
        paramVarArgs.e(11, this.uVu);
      }
      paramVarArgs.d(12, 8, this.uVv);
      paramVarArgs.fk(13, this.uVw);
      paramVarArgs.fk(14, this.uVx);
      GMTrace.o(16742050955264L, 124738);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uNh != null) {
        i = b.a.a.a.fj(1, this.uNh.aYq()) + 0;
      }
      paramInt = i;
      if (this.esG != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.esG);
      }
      i = paramInt;
      if (this.eEl != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eEl);
      }
      i = i + b.a.a.a.fh(4, this.uVq) + b.a.a.a.fh(5, this.uVr) + b.a.a.a.fh(6, this.aJb);
      paramInt = i;
      if (this.uVs != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uVs);
      }
      i = paramInt;
      if (this.uOc != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.uOc);
      }
      paramInt = i;
      if (this.gjJ != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.gjJ);
      }
      i = paramInt + b.a.a.a.fh(10, this.uVt);
      paramInt = i;
      if (this.uVu != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.uVu);
      }
      i = b.a.a.a.c(12, 8, this.uVv);
      int j = b.a.a.a.fh(13, this.uVw);
      int k = b.a.a.a.fh(14, this.uVx);
      GMTrace.o(16742050955264L, 124738);
      return paramInt + i + j + k;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uVv.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(16742050955264L, 124738);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bli localbli = (bli)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(16742050955264L, 124738);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new er();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((er)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbli.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(16742050955264L, 124738);
        return 0;
      case 2: 
        localbli.esG = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16742050955264L, 124738);
        return 0;
      case 3: 
        localbli.eEl = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16742050955264L, 124738);
        return 0;
      case 4: 
        localbli.uVq = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(16742050955264L, 124738);
        return 0;
      case 5: 
        localbli.uVr = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(16742050955264L, 124738);
        return 0;
      case 6: 
        localbli.aJb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(16742050955264L, 124738);
        return 0;
      case 7: 
        localbli.uVs = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16742050955264L, 124738);
        return 0;
      case 8: 
        localbli.uOc = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16742050955264L, 124738);
        return 0;
      case 9: 
        localbli.gjJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16742050955264L, 124738);
        return 0;
      case 10: 
        localbli.uVt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(16742050955264L, 124738);
        return 0;
      case 11: 
        localbli.uVu = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(16742050955264L, 124738);
        return 0;
      case 12: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bha();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bha)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localbli.uVv.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(16742050955264L, 124738);
        return 0;
      case 13: 
        localbli.uVw = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(16742050955264L, 124738);
        return 0;
      }
      localbli.uVx = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(16742050955264L, 124738);
      return 0;
    }
    GMTrace.o(16742050955264L, 124738);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\bli.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */