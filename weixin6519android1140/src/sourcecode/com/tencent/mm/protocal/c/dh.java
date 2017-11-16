package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class dh
  extends com.tencent.mm.bm.a
{
  public dj tRA;
  public com.tencent.mm.bm.b tRB;
  public di tRu;
  
  public dh()
  {
    GMTrace.i(3932847865856L, 29302);
    GMTrace.o(3932847865856L, 29302);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3932982083584L, 29303);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.tRA == null) {
        throw new b.a.a.b("Not all required fields were included: VoiceAttr");
      }
      if (this.tRu == null) {
        throw new b.a.a.b("Not all required fields were included: UploadCtx");
      }
      if (this.tRB == null) {
        throw new b.a.a.b("Not all required fields were included: VoiceData");
      }
      if (this.tRA != null)
      {
        paramVarArgs.fm(1, this.tRA.aYq());
        this.tRA.a(paramVarArgs);
      }
      if (this.tRu != null)
      {
        paramVarArgs.fm(2, this.tRu.aYq());
        this.tRu.a(paramVarArgs);
      }
      if (this.tRB != null) {
        paramVarArgs.b(3, this.tRB);
      }
      GMTrace.o(3932982083584L, 29303);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.tRA != null) {
        i = b.a.a.a.fj(1, this.tRA.aYq()) + 0;
      }
      paramInt = i;
      if (this.tRu != null) {
        paramInt = i + b.a.a.a.fj(2, this.tRu.aYq());
      }
      i = paramInt;
      if (this.tRB != null) {
        i = paramInt + b.a.a.a.a(3, this.tRB);
      }
      GMTrace.o(3932982083584L, 29303);
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
      if (this.tRA == null) {
        throw new b.a.a.b("Not all required fields were included: VoiceAttr");
      }
      if (this.tRu == null) {
        throw new b.a.a.b("Not all required fields were included: UploadCtx");
      }
      if (this.tRB == null) {
        throw new b.a.a.b("Not all required fields were included: VoiceData");
      }
      GMTrace.o(3932982083584L, 29303);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      dh localdh = (dh)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(3932982083584L, 29303);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new dj();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((dj)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdh.tRA = ((dj)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3932982083584L, 29303);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new di();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((di)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, com.tencent.mm.bm.a.a((b.a.a.a.a)localObject2))) {}
          localdh.tRu = ((di)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3932982083584L, 29303);
        return 0;
      }
      localdh.tRB = ((b.a.a.a.a)localObject1).csV();
      GMTrace.o(3932982083584L, 29303);
      return 0;
    }
    GMTrace.o(3932982083584L, 29303);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\dh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */