package org.jetbrains.spek.engine

import org.junit.platform.engine.UniqueId
import org.junit.platform.engine.support.descriptor.EngineDescriptor
import org.junit.platform.engine.support.hierarchical.Node

/**
 * @author Ranie Jade Ramiso
 */
class SpekEngineDescriptor(uniqueId: UniqueId): EngineDescriptor(uniqueId, "Spek"), Node<SpekExecutionContext>
