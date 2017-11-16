package com.tencent.mm.protocal.c;

import com.tencent.gmtrace.GMTrace;
import java.util.LinkedList;

public final class auf
  extends azh
{
  public String content;
  public boolean jAa;
  public String jzt;
  public int status;
  public String tNS;
  public String tNT;
  public String uJA;
  public String uJB;
  public String uJx;
  public String uJy;
  public String uJz;
  
  public auf()
  {
    GMTrace.i(3642937573376L, 27142);
    GMTrace.o(3642937573376L, 27142);
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    GMTrace.i(3643071791104L, 27143);
    if (paramInt == 0)
    {
      paramVarArgs = (b.a.a.c.a)paramVarArgs[0];
      if (this.uND != null)
      {
        paramVarArgs.fm(1, this.uND.aYq());
        this.uND.a(paramVarArgs);
      }
      if (this.tNS != null) {
        paramVarArgs.e(2, this.tNS);
      }
      if (this.tNT != null) {
        paramVarArgs.e(3, this.tNT);
      }
      paramVarArgs.fk(4, this.status);
      if (this.content != null) {
        paramVarArgs.e(5, this.content);
      }
      if (this.jzt != null) {
        paramVarArgs.e(6, this.jzt);
      }
      if (this.uJx != null) {
        paramVarArgs.e(7, this.uJx);
      }
      paramVarArgs.ah(8, this.jAa);
      if (this.uJy != null) {
        paramVarArgs.e(9, this.uJy);
      }
      if (this.uJz != null) {
        paramVarArgs.e(10, this.uJz);
      }
      if (this.uJA != null) {
        paramVarArgs.e(11, this.uJA);
      }
      if (this.uJB != null) {
        paramVarArgs.e(12, this.uJB);
      }
      GMTrace.o(3643071791104L, 27143);
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
      if (this.tNS != null) {
        paramInt = i + b.a.a.b.b.a.f(2, this.tNS);
      }
      i = paramInt;
      if (this.tNT != null) {
        i = paramInt + b.a.a.b.b.a.f(3, this.tNT);
      }
      i += b.a.a.a.fh(4, this.status);
      paramInt = i;
      if (this.content != null) {
        paramInt = i + b.a.a.b.b.a.f(5, this.content);
      }
      i = paramInt;
      if (this.jzt != null) {
        i = paramInt + b.a.a.b.b.a.f(6, this.jzt);
      }
      paramInt = i;
      if (this.uJx != null) {
        paramInt = i + b.a.a.b.b.a.f(7, this.uJx);
      }
      i = paramInt + (b.a.a.b.b.a.cK(8) + 1);
      paramInt = i;
      if (this.uJy != null) {
        paramInt = i + b.a.a.b.b.a.f(9, this.uJy);
      }
      i = paramInt;
      if (this.uJz != null) {
        i = paramInt + b.a.a.b.b.a.f(10, this.uJz);
      }
      paramInt = i;
      if (this.uJA != null) {
        paramInt = i + b.a.a.b.b.a.f(11, this.uJA);
      }
      i = paramInt;
      if (this.uJB != null) {
        i = paramInt + b.a.a.b.b.a.f(12, this.uJB);
      }
      GMTrace.o(3643071791104L, 27143);
      return i;
    }
    if (paramInt == 2)
    {
      paramVarArgs = new b.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = azh.a(paramVarArgs); paramInt > 0; paramInt = azh.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.csW();
        }
      }
      GMTrace.o(3643071791104L, 27143);
      return 0;
    }
    if (paramInt == 3)
    {
      Object localObject1 = (b.a.a.a.a)paramVarArgs[0];
      auf localauf = (auf)paramVarArgs[1];
      paramInt = ((Integer)paramVarArgs[2]).intValue();
      switch (paramInt)
      {
      default: 
        GMTrace.o(3643071791104L, 27143);
        return -1;
      case 1: 
        paramVarArgs = ((b.a.a.a.a)localObject1).Gv(paramInt);
        i = paramVarArgs.size();
        paramInt = 0;
        while (paramInt < i)
        {
          Object localObject2 = (byte[])paramVarArgs.get(paramInt);
          localObject1 = new es();
          localObject2 = new b.a.a.a.a((byte[])localObject2, unknownTagHandler);
          for (boolean bool = true; bool; bool = ((es)localObject1).a((b.a.a.a.a)localObject2, (com.tencent.mm.bm.a)localObject1, azh.a((b.a.a.a.a)localObject2))) {}
          localauf.uND = ((es)localObject1);
          paramInt += 1;
        }
        GMTrace.o(3643071791104L, 27143);
        return 0;
      case 2: 
        localauf.tNS = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3643071791104L, 27143);
        return 0;
      case 3: 
        localauf.tNT = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3643071791104L, 27143);
        return 0;
      case 4: 
        localauf.status = ((b.a.a.a.a)localObject1).yqV.nj();
        GMTrace.o(3643071791104L, 27143);
        return 0;
      case 5: 
        localauf.content = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3643071791104L, 27143);
        return 0;
      case 6: 
        localauf.jzt = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3643071791104L, 27143);
        return 0;
      case 7: 
        localauf.uJx = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3643071791104L, 27143);
        return 0;
      case 8: 
        localauf.jAa = ((b.a.a.a.a)localObject1).csU();
        GMTrace.o(3643071791104L, 27143);
        return 0;
      case 9: 
        localauf.uJy = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3643071791104L, 27143);
        return 0;
      case 10: 
        localauf.uJz = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3643071791104L, 27143);
        return 0;
      case 11: 
        localauf.uJA = ((b.a.a.a.a)localObject1).yqV.readString();
        GMTrace.o(3643071791104L, 27143);
        return 0;
      }
      localauf.uJB = ((b.a.a.a.a)localObject1).yqV.readString();
      GMTrace.o(3643071791104L, 27143);
      return 0;
    }
    GMTrace.o(3643071791104L, 27143);
    return -1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\protocal\c\auf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */