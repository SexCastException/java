package org.omg.DynamicAny;


/**
* org/omg/DynamicAny/NameDynAnyPair.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/re/workspace/8-2-build-owindows-i586-cygwin/jdk8u40/2855/corba/src/share/classes/org/omg/DynamicAny/DynamicAny.idl
* Tuesday, February 10, 2015 10:07:59 PM PST
*/

public final class NameDynAnyPair implements org.omg.CORBA.portable.IDLEntity
{

  /**
        * The name associated with the DynAny.
        */
  public String id = null;

  /**
        * The DynAny value associated with the name.
        */
  public org.omg.DynamicAny.DynAny value = null;

  public NameDynAnyPair ()
  {
  } // ctor

  public NameDynAnyPair (String _id, org.omg.DynamicAny.DynAny _value)
  {
    id = _id;
    value = _value;
  } // ctor

} // class NameDynAnyPair