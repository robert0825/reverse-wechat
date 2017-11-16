package com.tencent.mm.protocal.c;

import b.a.a.b;
import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class ale
  extends azh
{
  public alc uAl;
  public md uAm;
  public bul uAn;
  public avk uAo;
  public av uAp;
  
  public ale()
  {
    GMTrace.i(15348065632256L, 114352);
    GMTrace.o(15348065632256L, 114352);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(15348199849984L, 114353);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.uAl != null)
      {
        paramVarArgs.fm(2, this.uAl.aYq());
        this.uAl.a(paramVarArgs);
      }
      if (this.uAm != null)
      {
        paramVarArgs.fm(3, this.uAm.aYq());
        this.uAm.a(paramVarArgs);
      }
      if (this.uAn != null)
      {
        paramVarArgs.fm(4, this.uAn.aYq());
        this.uAn.a(paramVarArgs);
      }
      if (this.uAo != null)
      {
        paramVarArgs.fm(5, this.uAo.aYq());
        this.uAo.a(paramVarArgs);
      }
      if (this.uAp != null)
      {
        paramVarArgs.fm(6, this.uAp.aYq());
        this.uAp.a(paramVarArgs);
      }
      GMTrace.o(15348199849984L, 114353);
      return 0;
    }
    int i;
    if (paramInt == 1)
    {
      i = 0;
      if (this.uND != null) {
        i = b.a.a.a.fj(1, this.uND.aYq()) + 0;
      }
      paramInt = i;
      if (this.uAl != null) {
        paramInt = i + b.a.a.a.fj(2, this.uAl.aYq());
      }
      i = paramInt;
      if (this.uAm != null) {
        i = paramInt + b.a.a.a.fj(3, this.uAm.aYq());
      }
      paramInt = i;
      if (this.uAn != null) {
        paramInt = i + b.a.a.a.fj(4, this.uAn.aYq());
      }
      i = paramInt;
      if (this.uAo != null) {
        i = paramInt + b.a.a.a.fj(5, this.uAo.aYq());
      }
      paramInt = i;
      if (this.uAp != null) {
        paramInt = i + b.a.a.a.fj(6, this.uAp.aYq());
      }
      GMTrace.o(15348199849984L, 114353);
      return paramInt;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      if (this.uND == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      GMTrace.o(15348199849984L, 114353);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      ale localale = (ale)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      Object localObject2;
      boolean bool;
      switch (paramInt)
      {
      default: 
        GMTrace.o(15348199849984L, 114353);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localale.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15348199849984L, 114353);
        return 0;
      case 2: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new alc();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((alc)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localale.uAl = ((alc)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15348199849984L, 114353);
        return 0;
      case 3: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new md();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((md)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localale.uAm = ((md)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15348199849984L, 114353);
        return 0;
      case 4: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new bul();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((bul)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localale.uAn = ((bul)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15348199849984L, 114353);
        return 0;
      case 5: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new avk();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (bool = true; bool; bool = ((avk)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localale.uAo = ((avk)localObject1);
          paramInt += 1;
        }
        GMTrace.o(15348199849984L, 114353);
        return 0;
      }
      paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
      i = paramVarArgs.size();
      paramInt = 0;
      while (paramInt < i)
      {
        localObject2 = (byte[])paramVarArgs.get(paramInt);
        localObject1 = new av();
        localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
        for (bool = true; bool; bool = ((av)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
        localale.uAp = ((av)localObject1);
        paramInt += 1;
      }
      GMTrace.o(15348199849984L, 114353);
      return 0;
    }
    GMTrace.o(15348199849984L, 114353);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\protocal\c\ale.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */