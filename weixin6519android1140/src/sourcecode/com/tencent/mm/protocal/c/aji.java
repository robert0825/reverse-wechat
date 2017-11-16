package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bm.b;
import java.util.LinkedList;

public final class aji
  extends ayx
{
  public String eDJ;
  public String eSd;
  public String signature;
  public String url;
  public String uxW;
  public String uxY;
  public String uxZ;
  public b uya;
  public int uyb;
  public LinkedList<ajw> uyf;
  
  public aji()
  {
    GMTrace.i(3949222428672L, 29424);
    this.uyf = new LinkedList();
    GMTrace.o(3949222428672L, 29424);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3949356646400L, 29425);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.url != null) {
        paramVarArgs.e(2, this.url);
      }
      if (this.eSd != null) {
        paramVarArgs.e(3, this.eSd);
      }
      if (this.uxW != null) {
        paramVarArgs.e(4, this.uxW);
      }
      if (this.eDJ != null) {
        paramVarArgs.e(5, this.eDJ);
      }
      if (this.uxY != null) {
        paramVarArgs.e(6, this.uxY);
      }
      if (this.signature != null) {
        paramVarArgs.e(7, this.signature);
      }
      if (this.uxZ != null) {
        paramVarArgs.e(8, this.uxZ);
      }
      if (this.uya != null) {
        paramVarArgs.b(9, this.uya);
      }
      paramVarArgs.fk(10, this.uyb);
      paramVarArgs.d(11, 8, this.uyf);
      GMTrace.o(3949356646400L, 29425);
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
      if (this.url != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.url);
      }
      i = paramInt;
      if (this.eSd != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.eSd);
      }
      paramInt = i;
      if (this.uxW != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.uxW);
      }
      i = paramInt;
      if (this.eDJ != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.eDJ);
      }
      paramInt = i;
      if (this.uxY != null) {
        paramInt = i + b.a.a.b.b.a.f(6, this.uxY);
      }
      i = paramInt;
      if (this.signature != null) {
        i = paramInt + b.a.a.b.b.a.f(7, this.signature);
      }
      paramInt = i;
      if (this.uxZ != null) {
        paramInt = i + b.a.a.b.b.a.f(8, this.uxZ);
      }
      i = paramInt;
      if (this.uya != null) {
        i = paramInt + b.a.a.a.a(9, this.uya);
      }
      paramInt = b.a.a.a.fh(10, this.uyb);
      int j = b.a.a.a.c(11, 8, this.uyf);
      GMTrace.o(3949356646400L, 29425);
      return i + paramInt + j;
    }
    if (paramInt == 2)
    {
      paramVarArgs = (byte[])paramVarArgs[0];
      this.uyf.clear();
      paramVarArgs = new b.a.a.a.a(paramVarArgs, unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3949356646400L, 29425);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      aji localaji = (aji)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3949356646400L, 29425);
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
          localaji.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3949356646400L, 29425);
        return 0;
      case 2: 
        localaji.url = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3949356646400L, 29425);
        return 0;
      case 3: 
        localaji.eSd = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3949356646400L, 29425);
        return 0;
      case 4: 
        localaji.uxW = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3949356646400L, 29425);
        return 0;
      case 5: 
        localaji.eDJ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3949356646400L, 29425);
        return 0;
      case 6: 
        localaji.uxY = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3949356646400L, 29425);
        return 0;
      case 7: 
        localaji.signature = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3949356646400L, 29425);
        return 0;
      case 8: 
        localaji.uxZ = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3949356646400L, 29425);
        return 0;
      case 9: 
        localaji.uya = ((b.a.a.a.a)localObject1).csV();
        GMTrace.o(3949356646400L, 29425);
        return 0;
      case 10: 
        localaji.uyb = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3949356646400L, 29425);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ajw();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ajw)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localaji.uyf.add(localObject1);
        paramInt += 1;
      }
      GMTrace.o(3949356646400L, 29425);
      return 0;
    }
    GMTrace.o(3949356646400L, 29425);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\aji.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */