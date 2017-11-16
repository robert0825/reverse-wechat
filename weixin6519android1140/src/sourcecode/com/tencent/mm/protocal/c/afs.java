package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class afs
  extends ayx
{
  public String jhi;
  public int tOG;
  public azp tSj;
  public azp unP;
  public String uvt;
  
  public afs()
  {
    GMTrace.i(3732460797952L, 27809);
    GMTrace.o(3732460797952L, 27809);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3732595015680L, 27810);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tSj == null) {
        throw new b("Not all required fields were included: A2Key");
      }
      if (this.uNh != null)
      {
        paramVarArgs.fm(1, this.uNh.aYq());
        this.uNh.a(paramVarArgs);
      }
      if (this.tSj != null)
      {
        paramVarArgs.fm(2, this.tSj.aYq());
        this.tSj.a(paramVarArgs);
      }
      if (this.jhi != null) {
        paramVarArgs.e(3, this.jhi);
      }
      paramVarArgs.fk(4, this.tOG);
      if (this.uvt != null) {
        paramVarArgs.e(5, this.uvt);
      }
      if (this.unP != null)
      {
        paramVarArgs.fm(6, this.unP.aYq());
        this.unP.a(paramVarArgs);
      }
      GMTrace.o(3732595015680L, 27810);
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
      if (this.tSj != null) {
        paramInt = i + b.a.a.a.fj(2, this.tSj.aYq());
      }
      i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jhi);
      }
      i += b.a.a.a.fh(4, this.tOG);
      paramInt = i;
      if (this.uvt != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.uvt);
      }
      i = paramInt;
      if (this.unP != null) {
        i = paramInt + b.a.a.a.fj(6, this.unP.aYq());
      }
      GMTrace.o(3732595015680L, 27810);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = ayx.a(paramVarArgs); paramInt > 0; paramInt = ayx.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tSj == null) {
        throw new b("Not all required fields were included: A2Key");
      }
      GMTrace.o(3732595015680L, 27810);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      afs localafs = (afs)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3732595015680L, 27810);
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
          localafs.uNh = ((er)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3732595015680L, 27810);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
          localafs.tSj = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3732595015680L, 27810);
        return 0;
      case 3: 
        localafs.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3732595015680L, 27810);
        return 0;
      case 4: 
        localafs.tOG = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3732595015680L, 27810);
        return 0;
      case 5: 
        localafs.uvt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3732595015680L, 27810);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new azp();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, ayx.a((b.a.a.a.a)localObject2))) {}
        localafs.unP = ((azp)localObject1);
        paramInt += 1;
      }
      GMTrace.o(3732595015680L, 27810);
      return 0;
    }
    GMTrace.o(3732595015680L, 27810);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\afs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */