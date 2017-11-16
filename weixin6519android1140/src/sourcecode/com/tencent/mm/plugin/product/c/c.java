package com.tencent.mm.plugin.product.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class c
  extends com.tencent.mm.bm.a
{
  public String glz;
  public String nEr;
  public int nIA;
  public int nIB;
  public LinkedList<m> nIC;
  public LinkedList<a> nID;
  public k nIE;
  public LinkedList<d> nIr;
  public int nIs;
  public int nIt;
  public int nIu;
  public LinkedList<String> nIv;
  public String nIw;
  public LinkedList<String> nIx;
  public LinkedList<b> nIy;
  public LinkedList<String> nIz;
  public String name;
  public int version;
  
  public c()
  {
    GMTrace.i(6041274155008L, 45011);
    this.nIr = new LinkedList();
    this.nIv = new LinkedList();
    this.nIx = new LinkedList();
    this.nIy = new LinkedList();
    this.nIz = new LinkedList();
    this.nIC = new LinkedList();
    this.nID = new LinkedList();
    GMTrace.o(6041274155008L, 45011);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(6041408372736L, 45012);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.name != null) {
        paramVarArgs.e(1, this.name);
      }
      paramVarArgs.d(2, 8, this.nIr);
      paramVarArgs.fk(3, this.nIs);
      paramVarArgs.fk(4, this.nIt);
      paramVarArgs.fk(5, this.nIu);
      paramVarArgs.d(6, 1, this.nIv);
      if (this.glz != null) {
        paramVarArgs.e(7, this.glz);
      }
      if (this.nIw != null) {
        paramVarArgs.e(8, this.nIw);
      }
      paramVarArgs.d(9, 1, this.nIx);
      paramVarArgs.d(10, 8, this.nIy);
      paramVarArgs.d(11, 1, this.nIz);
      paramVarArgs.fk(12, this.nIA);
      paramVarArgs.fk(13, this.nIB);
      paramVarArgs.d(14, 8, this.nIC);
      paramVarArgs.fk(15, this.version);
      paramVarArgs.d(16, 8, this.nID);
      if (this.nEr != null) {
        paramVarArgs.e(17, this.nEr);
      }
      if (this.nIE != null)
      {
        paramVarArgs.fm(18, this.nIE.aYq());
        this.nIE.a(paramVarArgs);
      }
      GMTrace.o(6041408372736L, 45012);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      paramInt = 0;
      if (this.name != null) {
        paramInt = b.a.a.b.b.a.f(1, this.name) + 0;
      }
      i = paramInt + b.a.a.a.c(2, 8, this.nIr) + b.a.a.a.fh(3, this.nIs) + b.a.a.a.fh(4, this.nIt) + b.a.a.a.fh(5, this.nIu) + b.a.a.a.c(6, 1, this.nIv);
      paramInt = i;
      if (this.glz != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.glz);
      }
      i = paramInt;
      if (this.nIw != null) {
        i = paramInt + b.a.a.b.b.a.f(8, this.nIw);
      }
      i = i + b.a.a.a.c(9, 1, this.nIx) + b.a.a.a.c(10, 8, this.nIy) + b.a.a.a.c(11, 1, this.nIz) + b.a.a.a.fh(12, this.nIA) + b.a.a.a.fh(13, this.nIB) + b.a.a.a.c(14, 8, this.nIC) + b.a.a.a.fh(15, this.version) + b.a.a.a.c(16, 8, this.nID);
      paramInt = i;
      if (this.nEr != null) {
        paramInt = i + b.a.a.b.b.a.f(17, this.nEr);
      }
      i = paramInt;
      if (this.nIE != null) {
        i = paramInt + b.a.a.a.fj(18, this.nIE.aYq());
      }
      GMTrace.o(6041408372736L, 45012);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.nIr.clear();
      this.nIv.clear();
      this.nIx.clear();
      this.nIy.clear();
      this.nIz.clear();
      this.nIC.clear();
      this.nID.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(6041408372736L, 45012);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      c localc = (c)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(6041408372736L, 45012);
        return -1;
      case 1: 
        localc.name = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new d();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((d)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localc.nIr.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 3: 
        localc.nIs = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 4: 
        localc.nIt = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 5: 
        localc.nIu = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 6: 
        localc.nIv.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 7: 
        localc.glz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 8: 
        localc.nIw = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 9: 
        localc.nIx.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 10: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new b();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((b)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localc.nIy.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 11: 
        localc.nIz.add(((b.a.a.a.a)localObject1).yqV.readString());
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 12: 
        localc.nIA = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 13: 
        localc.nIB = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 14: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new m();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((m)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localc.nIC.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 15: 
        localc.version = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 16: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new a();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((a)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localc.nID.add(localObject1);
          paramInt += 1;
        }
        GMTrace.o(6041408372736L, 45012);
        return 0;
      case 17: 
        localc.nEr = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(6041408372736L, 45012);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new k();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((k)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localc.nIE = ((k)localObject1);
        paramInt += 1;
      }
      GMTrace.o(6041408372736L, 45012);
      return 0;
    }
    GMTrace.o(6041408372736L, 45012);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\product\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */