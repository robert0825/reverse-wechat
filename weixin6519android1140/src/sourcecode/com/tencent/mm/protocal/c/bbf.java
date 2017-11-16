package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class bbf
  extends com.tencent.mm.bm.a
{
  public qm tRZ;
  public azp tSa;
  public azp tSb;
  public int tSp;
  
  public bbf()
  {
    GMTrace.i(13576928493568L, 101156);
    GMTrace.o(13576928493568L, 101156);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13577062711296L, 101157);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tSb == null) {
        throw new b("Not all required fields were included: AutoAuthKey");
      }
      if (this.tRZ == null) {
        throw new b("Not all required fields were included: SvrPubECDHKey");
      }
      if (this.tSa == null) {
        throw new b("Not all required fields were included: SessionKey");
      }
      if (this.tSb != null)
      {
        paramVarArgs.fm(1, this.tSb.aYq());
        this.tSb.a(paramVarArgs);
      }
      if (this.tRZ != null)
      {
        paramVarArgs.fm(2, this.tRZ.aYq());
        this.tRZ.a(paramVarArgs);
      }
      if (this.tSa != null)
      {
        paramVarArgs.fm(3, this.tSa.aYq());
        this.tSa.a(paramVarArgs);
      }
      paramVarArgs.fk(4, this.tSp);
      GMTrace.o(13577062711296L, 101157);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.tSb != null) {
        i = b.a.a.a.fj(1, this.tSb.aYq()) + 0;
      }
      paramInt = i;
      if (this.tRZ != null) {
        paramInt = i + b.a.a.a.fj(2, this.tRZ.aYq());
      }
      i = paramInt;
      if (this.tSa != null) {
        i = paramInt + b.a.a.a.fj(3, this.tSa.aYq());
      }
      paramInt = b.a.a.a.fh(4, this.tSp);
      GMTrace.o(13577062711296L, 101157);
      return i + paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tSb == null) {
        throw new b("Not all required fields were included: AutoAuthKey");
      }
      if (this.tRZ == null) {
        throw new b("Not all required fields were included: SvrPubECDHKey");
      }
      if (this.tSa == null) {
        throw new b("Not all required fields were included: SessionKey");
      }
      GMTrace.o(13577062711296L, 101157);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      bbf localbbf = (bbf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13577062711296L, 101157);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbbf.tSb = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13577062711296L, 101157);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new qm();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((qm)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbbf.tRZ = ((qm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13577062711296L, 101157);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new azp();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((azp)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localbbf.tSa = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13577062711296L, 101157);
        return 0;
      }
      localbbf.tSp = ((b.a.a.a.a)localObject1).yqV.nj();
      GMTrace.o(13577062711296L, 101157);
      return 0;
    }
    GMTrace.o(13577062711296L, 101157);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\bbf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */