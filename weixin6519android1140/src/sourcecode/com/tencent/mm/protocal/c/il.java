package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class il
  extends com.tencent.mm.bm.a
{
  public String eBt;
  public String lPj;
  public String nFH;
  public io tXp;
  public ip tXq;
  public ii tXr;
  
  public il()
  {
    GMTrace.i(3714207186944L, 27673);
    GMTrace.o(3714207186944L, 27673);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3714341404672L, 27674);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.lPj == null) {
        throw new b("Not all required fields were included: Desc");
      }
      if (this.nFH == null) {
        throw new b("Not all required fields were included: ThumbUrl");
      }
      if (this.tXp == null) {
        throw new b("Not all required fields were included: DetailInfo");
      }
      if (this.tXr == null) {
        throw new b("Not all required fields were included: ActionInfo");
      }
      if (this.eBt != null) {
        paramVarArgs.e(1, this.eBt);
      }
      if (this.lPj != null) {
        paramVarArgs.e(2, this.lPj);
      }
      if (this.nFH != null) {
        paramVarArgs.e(3, this.nFH);
      }
      if (this.tXp != null)
      {
        paramVarArgs.fm(4, this.tXp.aYq());
        this.tXp.a(paramVarArgs);
      }
      if (this.tXq != null)
      {
        paramVarArgs.fm(5, this.tXq.aYq());
        this.tXq.a(paramVarArgs);
      }
      if (this.tXr != null)
      {
        paramVarArgs.fm(6, this.tXr.aYq());
        this.tXr.a(paramVarArgs);
      }
      GMTrace.o(3714341404672L, 27674);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.eBt != null) {
        i = b.a.a.b.b.a.f(1, this.eBt) + 0;
      }
      paramInt = i;
      if (this.lPj != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.lPj);
      }
      i = paramInt;
      if (this.nFH != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.nFH);
      }
      paramInt = i;
      if (this.tXp != null) {
        paramInt = i + b.a.a.a.fj(4, this.tXp.aYq());
      }
      i = paramInt;
      if (this.tXq != null) {
        i = paramInt + b.a.a.a.fj(5, this.tXq.aYq());
      }
      paramInt = i;
      if (this.tXr != null) {
        paramInt = i + b.a.a.a.fj(6, this.tXr.aYq());
      }
      GMTrace.o(3714341404672L, 27674);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.eBt == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.lPj == null) {
        throw new b("Not all required fields were included: Desc");
      }
      if (this.nFH == null) {
        throw new b("Not all required fields were included: ThumbUrl");
      }
      if (this.tXp == null) {
        throw new b("Not all required fields were included: DetailInfo");
      }
      if (this.tXr == null) {
        throw new b("Not all required fields were included: ActionInfo");
      }
      GMTrace.o(3714341404672L, 27674);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      il localil = (il)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3714341404672L, 27674);
        return -1;
      case 1: 
        localil.eBt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3714341404672L, 27674);
        return 0;
      case 2: 
        localil.lPj = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3714341404672L, 27674);
        return 0;
      case 3: 
        localil.nFH = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3714341404672L, 27674);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new io();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((io)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localil.tXp = ((io)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3714341404672L, 27674);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new ip();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((ip)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localil.tXq = ((ip)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3714341404672L, 27674);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new ii();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((ii)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
        localil.tXr = ((ii)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3714341404672L, 27674);
      return 0;
    }
    GMTrace.o(3714341404672L, 27674);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\il.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */