package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bth
  extends com.tencent.mm.bm.a
{
  public int tOG;
  public int tWu;
  public String tXx;
  public int uBR;
  public all uBS;
  public int uMX;
  public String unf;
  public int vaU;
  public String vaX;
  public int vca;
  public LinkedList<nq> vcb;
  
  public bth()
  {
    GMTrace.i(20386464923648L, 151891);
    this.vaU = 2;
    this.vcb = new LinkedList();
    GMTrace.o(20386464923648L, 151891);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(20386599141376L, 151892);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fk(1, this.tWu);
      paramVarArgs.fk(2, this.uBR);
      paramVarArgs.fk(3, this.uMX);
      if (this.unf != null) {
        paramVarArgs.e(4, this.unf);
      }
      if (this.uBS != null)
      {
        paramVarArgs.fm(5, this.uBS.aYq());
        this.uBS.a(paramVarArgs);
      }
      paramVarArgs.fk(6, this.tOG);
      if (this.tXx != null) {
        paramVarArgs.e(7, this.tXx);
      }
      paramVarArgs.fk(8, this.vca);
      paramVarArgs.fk(9, this.vaU);
      paramVarArgs.d(10, 8, this.vcb);
      if (this.vaX != null) {
        paramVarArgs.e(11, this.vaX);
      }
      GMTrace.o(20386599141376L, 151892);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = b.a.a.a.fh(1, this.tWu) + 0 + b.a.a.a.fh(2, this.uBR) + b.a.a.a.fh(3, this.uMX);
      paramInt = i;
      if (this.unf != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.unf);
      }
      i = paramInt;
      if (this.uBS != null) {
        i = paramInt + b.a.a.a.fj(5, this.uBS.aYq());
      }
      i += b.a.a.a.fh(6, this.tOG);
      paramInt = i;
      if (this.tXx != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.tXx);
      }
      i = paramInt + b.a.a.a.fh(8, this.vca) + b.a.a.a.fh(9, this.vaU) + b.a.a.a.c(10, 8, this.vcb);
      paramInt = i;
      if (this.vaX != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.vaX);
      }
      GMTrace.o(20386599141376L, 151892);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.vcb.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(20386599141376L, 151892);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bth localbth = (bth)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(20386599141376L, 151892);
        return -1;
      case 1: 
        localbth.tWu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20386599141376L, 151892);
        return 0;
      case 2: 
        localbth.uBR = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20386599141376L, 151892);
        return 0;
      case 3: 
        localbth.uMX = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20386599141376L, 151892);
        return 0;
      case 4: 
        localbth.unf = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20386599141376L, 151892);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new all();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((all)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbth.uBS = ((all)localObject1);
          paramInt += 1;
        }
        GMTrace.o(20386599141376L, 151892);
        return 0;
      case 6: 
        localbth.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20386599141376L, 151892);
        return 0;
      case 7: 
        localbth.tXx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(20386599141376L, 151892);
        return 0;
      case 8: 
        localbth.vca = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20386599141376L, 151892);
        return 0;
      case 9: 
        localbth.vaU = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(20386599141376L, 151892);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new nq();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((nq)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbth.vcb.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(20386599141376L, 151892);
        return 0;
      }
      localbth.vaX = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(20386599141376L, 151892);
      return 0;
    }
    GMTrace.o(20386599141376L, 151892);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bth.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */