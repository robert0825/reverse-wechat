package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ani
  extends com.tencent.mm.bm.a
{
  public String jhi;
  public qm tSF;
  public azp tUK;
  public String tUR;
  public String tVd;
  
  public ani()
  {
    GMTrace.i(13580283936768L, 101181);
    GMTrace.o(13580283936768L, 101181);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(13580418154496L, 101182);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tUK == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (this.tSF == null) {
        throw new b("Not all required fields were included: CliPubECDHKey");
      }
      if (this.tUK != null)
      {
        paramVarArgs.fm(1, this.tUK.aYq());
        this.tUK.a(paramVarArgs);
      }
      if (this.tSF != null)
      {
        paramVarArgs.fm(2, this.tSF.aYq());
        this.tSF.a(paramVarArgs);
      }
      if (this.jhi != null) {
        paramVarArgs.e(3, this.jhi);
      }
      if (this.tUR != null) {
        paramVarArgs.e(4, this.tUR);
      }
      if (this.tVd != null) {
        paramVarArgs.e(5, this.tVd);
      }
      GMTrace.o(13580418154496L, 101182);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.tUK != null) {
        i = b.a.a.a.fj(1, this.tUK.aYq()) + 0;
      }
      paramInt = i;
      if (this.tSF != null) {
        paramInt = i + b.a.a.a.fj(2, this.tSF.aYq());
      }
      i = paramInt;
      if (this.jhi != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.jhi);
      }
      paramInt = i;
      if (this.tUR != null) {
        paramInt = i + b.a.a.b.b.a.f(4, this.tUR);
      }
      i = paramInt;
      if (this.tVd != null) {
        i = paramInt + b.a.a.b.b.a.f(5, this.tVd);
      }
      GMTrace.o(13580418154496L, 101182);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bm.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bm.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.tUK == null) {
        throw new b("Not all required fields were included: RandomEncryKey");
      }
      if (this.tSF == null) {
        throw new b("Not all required fields were included: CliPubECDHKey");
      }
      GMTrace.o(13580418154496L, 101182);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ani localani = (ani)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(13580418154496L, 101182);
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
          localani.tUK = ((azp)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13580418154496L, 101182);
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
          localani.tSF = ((qm)localObject1);
          paramInt += 1;
        }
        GMTrace.o(13580418154496L, 101182);
        return 0;
      case 3: 
        localani.jhi = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13580418154496L, 101182);
        return 0;
      case 4: 
        localani.tUR = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(13580418154496L, 101182);
        return 0;
      }
      localani.tVd = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(13580418154496L, 101182);
      return 0;
    }
    GMTrace.o(13580418154496L, 101182);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\protocal\c\ani.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */